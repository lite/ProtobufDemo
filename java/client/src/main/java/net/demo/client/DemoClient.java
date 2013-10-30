package net.demo.client;

import net.demo.proto.KVCommand;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class DemoClient {
    public static void main(String[] args)
    {
        Thread t = new Thread(new ClientThread());
        // Lets run Thread in background..
        // Sometimes you need to run thread in background for your Timer application..
        t.start(); // starts thread in background..
        // t.run(); // is going to execute the code in the thread's run method on the current thread..
        System.out.println("Main() Program Exited...\n");
    }

}
