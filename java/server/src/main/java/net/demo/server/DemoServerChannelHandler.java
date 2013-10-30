package net.demo.server;

import org.apache.log4j.Logger;
import org.jboss.netty.channel.*;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import net.demo.proto.KVCommand.KVItem;

public class DemoServerChannelHandler extends SimpleChannelHandler {

    private static final Logger logger = Logger.getLogger(
            DemoServerChannelHandler.class.getName());

    private volatile Channel channel;
    private final BlockingQueue<String> answer = new LinkedBlockingQueue<String>();

    @Override
    public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e)
            throws Exception {
        channel = e.getChannel();
        super.channelOpen(ctx, e);
    }

    @Override
    public void handleUpstream(
            ChannelHandlerContext ctx, ChannelEvent e) throws Exception {
        if (e instanceof ChannelStateEvent) {
            logger.info(e.toString());
        }
        super.handleUpstream(ctx, e);
    }

    @Override
    public void exceptionCaught(
            ChannelHandlerContext ctx, ExceptionEvent e) {
        logger.warn("Unexpected exception from downstream.", e.getCause());
        e.getChannel().close();
    }

    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {
        KVItem item = (KVItem) e.getMessage();

        KVItem.Builder builder = KVItem.newBuilder();
        String command = item.getCommand();
        logger.info(command);
        builder.setCommand(command);

        e.getChannel().write(builder.build());
    }

}