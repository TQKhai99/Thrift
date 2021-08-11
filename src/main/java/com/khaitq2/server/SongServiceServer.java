package com.khaitq2.server;

import com.khaitq2.config.Config;
import com.khaitq2.handler.SongServiceHandler;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.*;
import com.khaitq2.songservice.SongService.Processor;


public class SongServiceServer {

    public static SongServiceHandler handler;

    public static Processor processor;

    public static void main(String[] args) {
        try {
            handler = new SongServiceHandler();
            processor = new Processor(handler);

            Runnable simple = () -> simple(processor);

            new Thread(simple).start();
            new Thread(() -> {
                try {
                    while (true) {
                        handler.sortTopLike();
                        handler.sortTopStream();
                        Thread.sleep(5000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void simple(Processor processor) {
        try {
            TNonblockingServerSocket socket = new TNonblockingServerSocket(Integer.parseInt(Config.getInstance().getConfig().get("port")));
            TServer server = new TThreadedSelectorServer(new TThreadedSelectorServer.Args(socket).processor(processor).selectorThreads(3).workerThreads(5));
            System.out.println("starting the server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}