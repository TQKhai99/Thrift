import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.ArrayList;
import java.util.Arrays;

public class SongServiceClient {
    public static void main(String [] args) {
        try {
            TTransport transport;

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new  TBinaryProtocol(transport);
            SongService.Client client = new SongService.Client(protocol);

            perform(client);

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    private static void perform(SongService.Client client) throws TException{
        // init data
        client.put("ABC", new ArrayList<>(Arrays.asList("Sơn Tùng MTP")));
        client.put("BCD", new ArrayList<>(Arrays.asList("Sơn Tùng MTP")));
        client.put("CDE", new ArrayList<>(Arrays.asList("Sơn Tùng MTP")));
        client.put("DEF", new ArrayList<>(Arrays.asList("Sơn Tùng MTP")));
        client.put("EFG", new ArrayList<>(Arrays.asList("Sơn Tùng MTP")));
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i + 1; j++){
                client.stream(i);
                client.like(4 - i);
            }
        }

        System.out.println("PUT SONG");
        client.put("Nơi này có anh", new ArrayList<>(Arrays.asList("Sơn Tùng MTP")));
        System.out.println("GET NEW SONG");
        System.out.println(client.get(5).toString());
        System.out.println("===================");

        client.put("Chạy ngay đi!", new ArrayList<>(Arrays.asList("Sơn Tùng MTP")));
        System.out.println("GET SONG");
        System.out.println(client.get(6).toString());
        System.out.println("REMOVE SONG");
        client.remove(6);
        System.out.println("GET SONG TO CHECK REMOVE");
        SongStruct song = client.get(6);
        if(song.title == null) {
            System.out.println("Không tồn tại bài hát");
        }
        else {
            System.out.println(song);
        }
        System.out.println("===================");

        System.out.println("GET SONG TO CHECK LIKE");
        System.out.println(client.get(5).toString());
        System.out.println("LIKE SONG");
        client.like(5);
        System.out.println("GET SONG TO CHECK LIKE");
        System.out.println(client.get(5).toString());
        System.out.println("===================");

        System.out.println("GET SONG TO CHECK UNLIKE");
        System.out.println(client.get(5).toString());
        System.out.println("UNLIKE");
        client.unlike(5);
        System.out.println("GET SONG TO CHECK UNLIKE");
        System.out.println(client.get(5).toString());
        System.out.println("===================");

        System.out.println("GET LIST TOP 5 SONG SORT BY STREAM");
        ArrayList<Integer> top5 = (ArrayList<Integer>) client.getTop5(true);
        for(int i = 0; i < top5.size(); i++){
            System.out.println(client.get(top5.get(i)).toString());
        }
        System.out.println("===================");

        System.out.println("GET LIST TOP 5 SONG SORT BY LIKE");
        top5 = (ArrayList<Integer>) client.getTop5(false);
        for(int i = 0; i < top5.size(); i++){
            System.out.println(client.get(top5.get(i)).toString());
        }
        System.out.println("===================");
    }
}
