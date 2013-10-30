package net.demo.client;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.handler.codec.protobuf.ProtobufDecoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufEncoder;

import net.demo.proto.KVCommand.KVItem;

public class DemoClientPipelineFactory implements ChannelPipelineFactory {
  
    public ChannelPipeline getPipeline() throws Exception {
        ChannelPipeline pipeline = Channels.pipeline();

        pipeline.addLast("decoder", new ProtobufDecoder(KVItem.getDefaultInstance()));
        pipeline.addLast("encoder", new ProtobufEncoder());
        pipeline.addLast("handler", new DemoClientChannelHandler());
 
        return pipeline;
    }
     
}  
