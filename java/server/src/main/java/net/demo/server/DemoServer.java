package net.demo.server;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class DemoServer {

    public static void main(String[] args) {
        ServerBootstrap bootstrap = new ServerBootstrap(
                    new NioServerSocketChannelFactory(
                            Executors.newCachedThreadPool(),
                            Executors.newCachedThreadPool()));
 
        bootstrap.setPipelineFactory(new DemoServerPipelineFactory());
        bootstrap.setOption("child.tcpNoDelay", true);
        bootstrap.setOption("child.keepAlive", true);
 
        int port = 8080;
        bootstrap.bind(new InetSocketAddress(port));
        System.out.println("listening port: " + port + "  server is starting……");
    }
}