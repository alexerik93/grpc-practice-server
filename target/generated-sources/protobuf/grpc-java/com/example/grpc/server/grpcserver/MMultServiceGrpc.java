package com.example.grpc.server.grpcserver;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: MMultService.proto")
public final class MMultServiceGrpc {

  private MMultServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.server.grpcserver.MMultService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.server.grpcserver.MMultRequest,
      com.example.grpc.server.grpcserver.MMultResponse> METHOD_MMULT =
      io.grpc.MethodDescriptor.<com.example.grpc.server.grpcserver.MMultRequest, com.example.grpc.server.grpcserver.MMultResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.server.grpcserver.MMultService", "mmult"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.grpcserver.MMultRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.grpcserver.MMultResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MMultServiceStub newStub(io.grpc.Channel channel) {
    return new MMultServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MMultServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MMultServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MMultServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MMultServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MMultServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void mmult(com.example.grpc.server.grpcserver.MMultRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.MMultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MMULT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_MMULT,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.server.grpcserver.MMultRequest,
                com.example.grpc.server.grpcserver.MMultResponse>(
                  this, METHODID_MMULT)))
          .build();
    }
  }

  /**
   */
  public static final class MMultServiceStub extends io.grpc.stub.AbstractStub<MMultServiceStub> {
    private MMultServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MMultServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MMultServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MMultServiceStub(channel, callOptions);
    }

    /**
     */
    public void mmult(com.example.grpc.server.grpcserver.MMultRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.MMultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MMULT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MMultServiceBlockingStub extends io.grpc.stub.AbstractStub<MMultServiceBlockingStub> {
    private MMultServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MMultServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MMultServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MMultServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.server.grpcserver.MMultResponse mmult(com.example.grpc.server.grpcserver.MMultRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MMULT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MMultServiceFutureStub extends io.grpc.stub.AbstractStub<MMultServiceFutureStub> {
    private MMultServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MMultServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MMultServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MMultServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.server.grpcserver.MMultResponse> mmult(
        com.example.grpc.server.grpcserver.MMultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MMULT, getCallOptions()), request);
    }
  }

  private static final int METHODID_MMULT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MMultServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MMultServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MMULT:
          serviceImpl.mmult((com.example.grpc.server.grpcserver.MMultRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.server.grpcserver.MMultResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class MMultServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.server.grpcserver.MMultServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MMultServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MMultServiceDescriptorSupplier())
              .addMethod(METHOD_MMULT)
              .build();
        }
      }
    }
    return result;
  }
}
