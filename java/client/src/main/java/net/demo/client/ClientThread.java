package net.demo.client;

import static org.jboss.netty.channel.Channels.pipeline;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import net.demo.proto.KVCommand;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.handler.codec.string.StringDecoder;
import org.jboss.netty.handler.codec.string.StringEncoder;

public class ClientThread implements Runnable
{
    private Channel channel;

    @Override
    public void run()
    {
        ClientBootstrap bootstrap = new ClientBootstrap(
                new NioClientSocketChannelFactory(
                        Executors.newCachedThreadPool(),
                        Executors.newCachedThreadPool()));

        bootstrap.setPipelineFactory(new DemoClientPipelineFactory());
        ChannelFuture future = bootstrap.connect(new InetSocketAddress("localhost", 8080));
        channel = future.awaitUninterruptibly().getChannel();

        for(int i=0; i<3; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            this.sendMsg();
        }

        channel.close().awaitUninterruptibly();
        bootstrap.releaseExternalResources();
    }

    public void sendMsg()
    {
        if(channel == null) return;

        KVCommand.KVItem.Builder builder = KVCommand.KVItem.newBuilder();
        builder.setCommand("hello");
        ChannelFuture lastWriteFuture = channel.write(builder.build());

        // Wait until all messages are flushed before closing the channel.
        if (lastWriteFuture != null) {
            lastWriteFuture.awaitUninterruptibly();
        }
    }

}
