package com.khaitq2.test;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.layered.TFramedTransport;
import com.khaitq2.songservice.Error;
import com.khaitq2.songservice.ListSongResult;
import com.khaitq2.songservice.SongResult;
import com.khaitq2.songservice.SongService;

import java.util.List;


public class SongServiceClient {

    public static void main(String[] args) {
        try {

            // CHECK STREAM AND TOP STREAM
//            for(int i = 0; i < 10; i++){
//                TTransport transport = new TFramedTransport(new TSocket("localhost", 9090));
//                transport.open();
//
//                TProtocol protocol = new  TBinaryProtocol(transport);
//                SongService.Client client = new SongService.Client(protocol);
//                new Thread(() -> {
//                    for(int j =0 ;j < 10;j++){
//                        performStreamSong(client, 1);
//                    }
//                }).start();
//            }
//
//            TTransport transport = new TFramedTransport(new TSocket("localhost", 9090));
//            transport.open();
//
//            TProtocol protocol = new  TBinaryProtocol(transport);
//            SongService.Client client = new SongService.Client(protocol);
//            performGetTopStream(client,5);
//            Thread.sleep(5000);
//            performGetTopStream(client,5);


            // CHECK LIKE AND TOP LIKE

            TTransport transport = new TFramedTransport(new TSocket("localhost", 9090));
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            SongService.Client client = new SongService.Client(protocol);

            client.edit(1,"12346");
            System.out.print(client.get(1));


            // CHECK PUT 100 LAN AND GET ID 105 IF EXIST => TRUE
//            for(int i = 0; i < 10; i++){
//                TTransport transport = new TFramedTransport(new TSocket("localhost", 9090));
//                transport.open();
//
//                TProtocol protocol = new  TBinaryProtocol(transport);
//                SongService.Client client = new SongService.Client(protocol);
//                new Thread(() -> {
//                    for(int j =0 ;j < 10;j++){
//                        performPutSong(client, "A", Arrays.asList("a"));
//                    }
//                }).start();
//            }
//
//            TTransport transport = new TFramedTransport(new TSocket("localhost", 9090));
//            transport.open();
//
//            TProtocol protocol = new  TBinaryProtocol(transport);
//            SongService.Client client = new SongService.Client(protocol);
//
//            Thread.sleep(5000);
//            performGetSong(client,105);


            // CHECK REMOVE AND GET LIST SONG OF ARTIST
//            TTransport transport = new TFramedTransport(new TSocket("localhost", 9090));
//            transport.open();
//
//            TProtocol protocol = new  TBinaryProtocol(transport);
//            SongService.Client client = new SongService.Client(protocol);
//
//            performRemoveSong(client,0);
//            performRemoveSong(client,1);
//            performRemoveSong(client,2);
//            performRemoveSong(client,4);
//            performRemoveSong(client,5);
//            performGetListSongOfArtist(client, "Adele");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void performGetSong(SongService.Client client, int id) {
        try {
            SongResult res = client.get(id);
            if (res.error.equals(Error.FAIL)) {
                return;
            }
            System.out.println(res.song);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void performPutSong(SongService.Client client, String name, List<String> singers) {
        try {
            client.put(name, singers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void performRemoveSong(SongService.Client client, int id) {
        try {
            Error res = client.remove(id);
            if (res.equals(Error.SUCCESS)) {
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void performLikeSong(SongService.Client client, int id) {
        try {
            Error res = client.like(id);
            if (res.equals(Error.SUCCESS)) {
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void performUnlikeSong(SongService.Client client, int id) {
        try {
            Error res = client.unlike(id);
            if (res.equals(Error.SUCCESS)) {
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void performStreamSong(SongService.Client client, int id) {
        try {
            Error res = client.stream(id);
            if (res.equals(Error.SUCCESS)) {
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void performGetTopStream(SongService.Client client, int topX) {
        try {
            ListSongResult list = client.getTopStream(topX);
            for (int i : list.listSong) {
                System.out.println(client.get(i).song);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void performGetTopLike(SongService.Client client, int topX) {
        try {
            ListSongResult list = client.getTopLike(topX);
            for (int i : list.listSong) {
                System.out.println(client.get(i).song);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void performGetListSongOfArtist(SongService.Client client, String nameOfSinger) {
        try {
            ListSongResult list = client.getListSongOfSinger(nameOfSinger);
            if (list.error.equals(Error.FAIL)) {
                return;
            }
            for (int i : list.listSong) {
                System.out.println(client.get(i).song);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

