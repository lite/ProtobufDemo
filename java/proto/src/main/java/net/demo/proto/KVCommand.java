// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KVCommand.proto

package net.demo.proto;

public final class KVCommand {
  private KVCommand() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface KVItemOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string command = 1;
    /**
     * <code>required string command = 1;</code>
     */
    boolean hasCommand();
    /**
     * <code>required string command = 1;</code>
     */
    java.lang.String getCommand();
    /**
     * <code>required string command = 1;</code>
     */
    com.google.protobuf.ByteString
        getCommandBytes();
  }
  /**
   * Protobuf type {@code KVItem}
   */
  public static final class KVItem extends
      com.google.protobuf.GeneratedMessage
      implements KVItemOrBuilder {
    // Use KVItem.newBuilder() to construct.
    private KVItem(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private KVItem(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final KVItem defaultInstance;
    public static KVItem getDefaultInstance() {
      return defaultInstance;
    }

    public KVItem getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private KVItem(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              command_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.demo.proto.KVCommand.internal_static_KVItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.demo.proto.KVCommand.internal_static_KVItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.demo.proto.KVCommand.KVItem.class, net.demo.proto.KVCommand.KVItem.Builder.class);
    }

    public static com.google.protobuf.Parser<KVItem> PARSER =
        new com.google.protobuf.AbstractParser<KVItem>() {
      public KVItem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KVItem(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<KVItem> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string command = 1;
    public static final int COMMAND_FIELD_NUMBER = 1;
    private java.lang.Object command_;
    /**
     * <code>required string command = 1;</code>
     */
    public boolean hasCommand() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string command = 1;</code>
     */
    public java.lang.String getCommand() {
      java.lang.Object ref = command_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          command_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string command = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCommandBytes() {
      java.lang.Object ref = command_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        command_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      command_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasCommand()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getCommandBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getCommandBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static net.demo.proto.KVCommand.KVItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.demo.proto.KVCommand.KVItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.demo.proto.KVCommand.KVItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.demo.proto.KVCommand.KVItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.demo.proto.KVCommand.KVItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static net.demo.proto.KVCommand.KVItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static net.demo.proto.KVCommand.KVItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static net.demo.proto.KVCommand.KVItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static net.demo.proto.KVCommand.KVItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static net.demo.proto.KVCommand.KVItem parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.demo.proto.KVCommand.KVItem prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code KVItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements net.demo.proto.KVCommand.KVItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.demo.proto.KVCommand.internal_static_KVItem_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.demo.proto.KVCommand.internal_static_KVItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.demo.proto.KVCommand.KVItem.class, net.demo.proto.KVCommand.KVItem.Builder.class);
      }

      // Construct using net.demo.proto.KVCommand.KVItem.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        command_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.demo.proto.KVCommand.internal_static_KVItem_descriptor;
      }

      public net.demo.proto.KVCommand.KVItem getDefaultInstanceForType() {
        return net.demo.proto.KVCommand.KVItem.getDefaultInstance();
      }

      public net.demo.proto.KVCommand.KVItem build() {
        net.demo.proto.KVCommand.KVItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public net.demo.proto.KVCommand.KVItem buildPartial() {
        net.demo.proto.KVCommand.KVItem result = new net.demo.proto.KVCommand.KVItem(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.command_ = command_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.demo.proto.KVCommand.KVItem) {
          return mergeFrom((net.demo.proto.KVCommand.KVItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.demo.proto.KVCommand.KVItem other) {
        if (other == net.demo.proto.KVCommand.KVItem.getDefaultInstance()) return this;
        if (other.hasCommand()) {
          bitField0_ |= 0x00000001;
          command_ = other.command_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCommand()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        net.demo.proto.KVCommand.KVItem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.demo.proto.KVCommand.KVItem) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string command = 1;
      private java.lang.Object command_ = "";
      /**
       * <code>required string command = 1;</code>
       */
      public boolean hasCommand() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string command = 1;</code>
       */
      public java.lang.String getCommand() {
        java.lang.Object ref = command_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          command_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string command = 1;</code>
       */
      public com.google.protobuf.ByteString
          getCommandBytes() {
        java.lang.Object ref = command_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          command_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string command = 1;</code>
       */
      public Builder setCommand(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        command_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string command = 1;</code>
       */
      public Builder clearCommand() {
        bitField0_ = (bitField0_ & ~0x00000001);
        command_ = getDefaultInstance().getCommand();
        onChanged();
        return this;
      }
      /**
       * <code>required string command = 1;</code>
       */
      public Builder setCommandBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        command_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:KVItem)
    }

    static {
      defaultInstance = new KVItem(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:KVItem)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_KVItem_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_KVItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017KVCommand.proto\"\031\n\006KVItem\022\017\n\007command\030\001" +
      " \002(\tB\033\n\016net.demo.protoB\tKVCommand"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_KVItem_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_KVItem_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_KVItem_descriptor,
              new java.lang.String[] { "Command", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
