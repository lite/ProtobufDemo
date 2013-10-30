package net.demo.client;

import org.apache.log4j.Logger;
import org.jboss.netty.channel.*;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import net.demo.proto.KVCommand.KVItem;

public class DemoClientChannelHandler extends SimpleChannelHandler {

    private static final Logger logger = Logger.getLogger(
            DemoClientChannelHandler.class.getName());

    @Override
    public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e)
            throws Exception {
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
        KVItem item = (KVItem)e.getMessage();
        logger.info(item.getCommand());
    }
}