import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.layered.TFramedTransport;

import java.util.Arrays;
import java.util.List;

class RunnableWorker implements Runnable{

    @Override
    public void run() {
        try{
            TTransport transport = new TFramedTransport(new TSocket("localhost", 9090));
            transport.open();

            TProtocol protocol = new  TBinaryProtocol(transport);
            SongService.Client client = new SongService.Client(protocol);
            System.out.println(Thread.currentThread().getName());
            performGetTop5Like(client);
            performLikeSong(client, 5);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public static void performGetSong(SongService.Client client, int id){
        try{
            SongResult res = client.get(id);
            if(res.error == 200){
                System.out.println(res.song);
                return;
            }
            System.out.println("No Result");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performPutSong(SongService.Client client, String name, List<String> singers){
        try{
            client.put(name, singers);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performRemoveSong(SongService.Client client, int id){
        try{
            int res = client.remove(id);
            if(res == 200){
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performLikeSong(SongService.Client client, int id){
        try{
            int res = client.like(id);
            if(res == 200){
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performUnlikeSong(SongService.Client client, int id){
        try{
            int res = client.unlike(id);
            if(res == 200){
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performStreamSong(SongService.Client client, int id){
        try{
            int res = client.stream(id);
            if(res == 200){
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performGetTop5Stream(SongService.Client client){
        try{
            SongResult list = client.getTop5Stream();
            for(int i : list.listsong){
                System.out.println(client.get(i).song);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void performGetTop5Like(SongService.Client client){
        try{
            SongResult list = client.getTop5Like();
            for(int i : list.listsong){
                System.out.println(client.get(i).song);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performGetListSongOfArtist(SongService.Client client, String nameOfSinger){
        try{
            SongResult list = client.getListSongOfSinger(nameOfSinger);
            if(list.error == 200) {
                for (int i : list.listsong) {
                    SongResult res = client.get(i);
                    if(res.error == 200){
                        System.out.println(res.song);
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}

public class SongServiceClient {
    public static void main(String [] args) {
        try{
            TTransport transport = new TFramedTransport(new TSocket("localhost", 9090));
            transport.open();

            TProtocol protocol = new  TBinaryProtocol(transport);
            SongService.Client client = new SongService.Client(protocol);

            performLikeSong(client, 5);
            performLikeSong(client, 1);
            performLikeSong(client, 1);
            performLikeSong(client, 3);
            performLikeSong(client, 5);
            performGetTop5Like(client);
            performUnlikeSong(client, 1);
            performUnlikeSong(client, 1);
            performGetTop5Like(client);
        } catch (Exception e){
            e.printStackTrace();
        }

            /*Runnable r = new RunnableWorker();
            Thread t1 = new Thread(r);
            Thread t2 = new Thread(r);
            Thread t3 = new Thread(r);

            t1.start();
            t2.start();
            t3.start();*/

            /*
            // get Song
            System.out.println("GET SONG");
            performGetSong(client, 1);
            System.out.println("++++++++++++++++++++++++++++++");
            // list artist
            System.out.println("LIST SONG OF ARTIST");
            performGetListSongOfArtist(client, "Adele");
            System.out.println("++++++++++++++++++++++++++++++");
            // put Song
            System.out.println("PUT SONG");
            performPutSong(client, "Baby", Arrays.asList("JB"));
            System.out.println("++++++++++++++++++++++++++++++");
            // remove Song
            System.out.println("REMOVE SONG");
            performGetSong(client,5);
            performRemoveSong(client, 5);
            performGetSong(client,5);
            System.out.println("++++++++++++++++++++++++++++++");
            // like song
            System.out.println("LIKE");
            performLikeSong(client, 4);
            System.out.println("++++++++++++++++++++++++++++++");
            // unlike song
            System.out.println("UNLIKE");
            performUnlikeSong(client, 4);
            System.out.println("++++++++++++++++++++++++++++++");
            // stream song
            System.out.println("STREAM");
            performStreamSong(client, 4);
            System.out.println("++++++++++++++++++++++++++++++");
            // list top like
            System.out.println("TOP LIKE");
            performGetTop5Like(client);
            System.out.println("++++++++++++++++++++++++++++++");

            // list top stream
            System.out.println("TOP STREAM");
            performGetTop5Stream(client);
            System.out.println("++++++++++++++++++++++++++++++");

            // list artist
            System.out.println("LIST SONG OF ARTIST");
            performGetListSongOfArtist(client, "Adele");
            System.out.println("++++++++++++++++++++++++++++++");
            // list artist
            System.out.println("LIST SONG OF ARTIST");
            performGetListSongOfArtist(client, "BP");
            System.out.println("++++++++++++++++++++++++++++++");
            transport.close();*/
    }

    public static void performGetSong(SongService.Client client, int id){
        try{
            SongResult res = client.get(id);
            if(res.error == 200){
                System.out.println(res.song);
                return;
            }
            System.out.println("No Result");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performPutSong(SongService.Client client, String name, List<String> singers){
        try{
            client.put(name, singers);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performRemoveSong(SongService.Client client, int id){
        try{
            int res = client.remove(id);
            if(res == 200){
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performLikeSong(SongService.Client client, int id){
        try{
            int res = client.like(id);
            if(res == 200){
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performUnlikeSong(SongService.Client client, int id){
        try{
            int res = client.unlike(id);
            if(res == 200){
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performStreamSong(SongService.Client client, int id){
        try{
            int res = client.stream(id);
            if(res == 200){
                System.out.println("OK");
                return;
            }
            System.out.println("NOT OK");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performGetTop5Stream(SongService.Client client){
        try{
            SongResult list = client.getTop5Stream();
            for(int i : list.listsong){
                System.out.println(client.get(i).song);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void performGetTop5Like(SongService.Client client){
        try{
            SongResult list = client.getTop5Like();
            for(int i : list.listsong){
                System.out.println(client.get(i).song);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void performGetListSongOfArtist(SongService.Client client, String nameOfSinger){
        try{
            SongResult list = client.getListSongOfSinger(nameOfSinger);
            if(list.error == 200) {
                for (int i : list.listsong) {
                    SongResult res = client.get(i);
                    if(res.error == 200){
                        System.out.println(res.song);
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}

