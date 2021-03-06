// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MMultService.proto

package com.example.grpc.server.grpcserver;

/**
 * Protobuf type {@code com.example.grpc.server.grpcserver.MMultResponse}
 */
public  final class MMultResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.server.grpcserver.MMultResponse)
    MMultResponseOrBuilder {
  // Use MMultResponse.newBuilder() to construct.
  private MMultResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MMultResponse() {
    matrixC_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MMultResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              matrixC_ = new java.util.ArrayList<com.example.grpc.server.grpcserver.Row>();
              mutable_bitField0_ |= 0x00000001;
            }
            matrixC_.add(
                input.readMessage(com.example.grpc.server.grpcserver.Row.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        matrixC_ = java.util.Collections.unmodifiableList(matrixC_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.server.grpcserver.MMultServiceOuterClass.internal_static_com_example_grpc_server_grpcserver_MMultResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.server.grpcserver.MMultServiceOuterClass.internal_static_com_example_grpc_server_grpcserver_MMultResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.server.grpcserver.MMultResponse.class, com.example.grpc.server.grpcserver.MMultResponse.Builder.class);
  }

  public static final int MATRIXC_FIELD_NUMBER = 1;
  private java.util.List<com.example.grpc.server.grpcserver.Row> matrixC_;
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  public java.util.List<com.example.grpc.server.grpcserver.Row> getMatrixCList() {
    return matrixC_;
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  public java.util.List<? extends com.example.grpc.server.grpcserver.RowOrBuilder> 
      getMatrixCOrBuilderList() {
    return matrixC_;
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  public int getMatrixCCount() {
    return matrixC_.size();
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  public com.example.grpc.server.grpcserver.Row getMatrixC(int index) {
    return matrixC_.get(index);
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  public com.example.grpc.server.grpcserver.RowOrBuilder getMatrixCOrBuilder(
      int index) {
    return matrixC_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < matrixC_.size(); i++) {
      output.writeMessage(1, matrixC_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < matrixC_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, matrixC_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.server.grpcserver.MMultResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.server.grpcserver.MMultResponse other = (com.example.grpc.server.grpcserver.MMultResponse) obj;

    boolean result = true;
    result = result && getMatrixCList()
        .equals(other.getMatrixCList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMatrixCCount() > 0) {
      hash = (37 * hash) + MATRIXC_FIELD_NUMBER;
      hash = (53 * hash) + getMatrixCList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.MMultResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.server.grpcserver.MMultResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.grpc.server.grpcserver.MMultResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.server.grpcserver.MMultResponse)
      com.example.grpc.server.grpcserver.MMultResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.server.grpcserver.MMultServiceOuterClass.internal_static_com_example_grpc_server_grpcserver_MMultResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.server.grpcserver.MMultServiceOuterClass.internal_static_com_example_grpc_server_grpcserver_MMultResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.server.grpcserver.MMultResponse.class, com.example.grpc.server.grpcserver.MMultResponse.Builder.class);
    }

    // Construct using com.example.grpc.server.grpcserver.MMultResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getMatrixCFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (matrixCBuilder_ == null) {
        matrixC_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        matrixCBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.server.grpcserver.MMultServiceOuterClass.internal_static_com_example_grpc_server_grpcserver_MMultResponse_descriptor;
    }

    public com.example.grpc.server.grpcserver.MMultResponse getDefaultInstanceForType() {
      return com.example.grpc.server.grpcserver.MMultResponse.getDefaultInstance();
    }

    public com.example.grpc.server.grpcserver.MMultResponse build() {
      com.example.grpc.server.grpcserver.MMultResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.server.grpcserver.MMultResponse buildPartial() {
      com.example.grpc.server.grpcserver.MMultResponse result = new com.example.grpc.server.grpcserver.MMultResponse(this);
      int from_bitField0_ = bitField0_;
      if (matrixCBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          matrixC_ = java.util.Collections.unmodifiableList(matrixC_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.matrixC_ = matrixC_;
      } else {
        result.matrixC_ = matrixCBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.server.grpcserver.MMultResponse) {
        return mergeFrom((com.example.grpc.server.grpcserver.MMultResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.server.grpcserver.MMultResponse other) {
      if (other == com.example.grpc.server.grpcserver.MMultResponse.getDefaultInstance()) return this;
      if (matrixCBuilder_ == null) {
        if (!other.matrixC_.isEmpty()) {
          if (matrixC_.isEmpty()) {
            matrixC_ = other.matrixC_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMatrixCIsMutable();
            matrixC_.addAll(other.matrixC_);
          }
          onChanged();
        }
      } else {
        if (!other.matrixC_.isEmpty()) {
          if (matrixCBuilder_.isEmpty()) {
            matrixCBuilder_.dispose();
            matrixCBuilder_ = null;
            matrixC_ = other.matrixC_;
            bitField0_ = (bitField0_ & ~0x00000001);
            matrixCBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMatrixCFieldBuilder() : null;
          } else {
            matrixCBuilder_.addAllMessages(other.matrixC_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.grpc.server.grpcserver.MMultResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.server.grpcserver.MMultResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.grpc.server.grpcserver.Row> matrixC_ =
      java.util.Collections.emptyList();
    private void ensureMatrixCIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        matrixC_ = new java.util.ArrayList<com.example.grpc.server.grpcserver.Row>(matrixC_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.server.grpcserver.Row, com.example.grpc.server.grpcserver.Row.Builder, com.example.grpc.server.grpcserver.RowOrBuilder> matrixCBuilder_;

    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public java.util.List<com.example.grpc.server.grpcserver.Row> getMatrixCList() {
      if (matrixCBuilder_ == null) {
        return java.util.Collections.unmodifiableList(matrixC_);
      } else {
        return matrixCBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public int getMatrixCCount() {
      if (matrixCBuilder_ == null) {
        return matrixC_.size();
      } else {
        return matrixCBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public com.example.grpc.server.grpcserver.Row getMatrixC(int index) {
      if (matrixCBuilder_ == null) {
        return matrixC_.get(index);
      } else {
        return matrixCBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public Builder setMatrixC(
        int index, com.example.grpc.server.grpcserver.Row value) {
      if (matrixCBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMatrixCIsMutable();
        matrixC_.set(index, value);
        onChanged();
      } else {
        matrixCBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public Builder setMatrixC(
        int index, com.example.grpc.server.grpcserver.Row.Builder builderForValue) {
      if (matrixCBuilder_ == null) {
        ensureMatrixCIsMutable();
        matrixC_.set(index, builderForValue.build());
        onChanged();
      } else {
        matrixCBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public Builder addMatrixC(com.example.grpc.server.grpcserver.Row value) {
      if (matrixCBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMatrixCIsMutable();
        matrixC_.add(value);
        onChanged();
      } else {
        matrixCBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public Builder addMatrixC(
        int index, com.example.grpc.server.grpcserver.Row value) {
      if (matrixCBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMatrixCIsMutable();
        matrixC_.add(index, value);
        onChanged();
      } else {
        matrixCBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public Builder addMatrixC(
        com.example.grpc.server.grpcserver.Row.Builder builderForValue) {
      if (matrixCBuilder_ == null) {
        ensureMatrixCIsMutable();
        matrixC_.add(builderForValue.build());
        onChanged();
      } else {
        matrixCBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public Builder addMatrixC(
        int index, com.example.grpc.server.grpcserver.Row.Builder builderForValue) {
      if (matrixCBuilder_ == null) {
        ensureMatrixCIsMutable();
        matrixC_.add(index, builderForValue.build());
        onChanged();
      } else {
        matrixCBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public Builder addAllMatrixC(
        java.lang.Iterable<? extends com.example.grpc.server.grpcserver.Row> values) {
      if (matrixCBuilder_ == null) {
        ensureMatrixCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, matrixC_);
        onChanged();
      } else {
        matrixCBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public Builder clearMatrixC() {
      if (matrixCBuilder_ == null) {
        matrixC_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        matrixCBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public Builder removeMatrixC(int index) {
      if (matrixCBuilder_ == null) {
        ensureMatrixCIsMutable();
        matrixC_.remove(index);
        onChanged();
      } else {
        matrixCBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public com.example.grpc.server.grpcserver.Row.Builder getMatrixCBuilder(
        int index) {
      return getMatrixCFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public com.example.grpc.server.grpcserver.RowOrBuilder getMatrixCOrBuilder(
        int index) {
      if (matrixCBuilder_ == null) {
        return matrixC_.get(index);  } else {
        return matrixCBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public java.util.List<? extends com.example.grpc.server.grpcserver.RowOrBuilder> 
         getMatrixCOrBuilderList() {
      if (matrixCBuilder_ != null) {
        return matrixCBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(matrixC_);
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public com.example.grpc.server.grpcserver.Row.Builder addMatrixCBuilder() {
      return getMatrixCFieldBuilder().addBuilder(
          com.example.grpc.server.grpcserver.Row.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public com.example.grpc.server.grpcserver.Row.Builder addMatrixCBuilder(
        int index) {
      return getMatrixCFieldBuilder().addBuilder(
          index, com.example.grpc.server.grpcserver.Row.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
     */
    public java.util.List<com.example.grpc.server.grpcserver.Row.Builder> 
         getMatrixCBuilderList() {
      return getMatrixCFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.server.grpcserver.Row, com.example.grpc.server.grpcserver.Row.Builder, com.example.grpc.server.grpcserver.RowOrBuilder> 
        getMatrixCFieldBuilder() {
      if (matrixCBuilder_ == null) {
        matrixCBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.grpc.server.grpcserver.Row, com.example.grpc.server.grpcserver.Row.Builder, com.example.grpc.server.grpcserver.RowOrBuilder>(
                matrixC_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        matrixC_ = null;
      }
      return matrixCBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.server.grpcserver.MMultResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.server.grpcserver.MMultResponse)
  private static final com.example.grpc.server.grpcserver.MMultResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.server.grpcserver.MMultResponse();
  }

  public static com.example.grpc.server.grpcserver.MMultResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MMultResponse>
      PARSER = new com.google.protobuf.AbstractParser<MMultResponse>() {
    public MMultResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MMultResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MMultResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MMultResponse> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.server.grpcserver.MMultResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

