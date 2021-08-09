import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.*;
import songservice.SongService;
import songservice.SongServiceHandler;


public class SongServiceServer {

    public static SongServiceHandler handler;

    public static SongService.Processor processor;

    public static void main(String [] args) {
        try {
            handler = new SongServiceHandler();
            processor = new SongService.Processor(handler);

            Runnable simple = new Runnable() {
                public void run() {
                    simple(processor);
                }
            };

            new Thread(simple).start();
            new Thread(() -> {
                try{
                    while(true){
                        handler.sortTopLike();
                        handler.sortTopStream();
                        Thread.sleep(5000);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void simple(SongService.Processor processor) {
        try {
            TNonblockingServerSocket socket = new TNonblockingServerSocket(9090);
            TServer server = new TThreadedSelectorServer(new TThreadedSelectorServer.Args(socket).processor(processor).selectorThreads(3).workerThreads(5));
            System.out.println("starting the server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}