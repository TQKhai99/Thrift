import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.*;



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
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void simple(SongService.Processor processor) {
        try {
            TNonblockingServerSocket socket = new TNonblockingServerSocket(9090);
            TServer server = new TThreadedSelectorServer(new TThreadedSelectorServer.Args(socket).processor(processor).selectorThreads(3).workerThreads(5));
            System.out.println("starting the simple server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}