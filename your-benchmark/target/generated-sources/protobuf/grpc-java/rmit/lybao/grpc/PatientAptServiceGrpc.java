package rmit.lybao.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: TestData.proto")
public final class PatientAptServiceGrpc {

  private PatientAptServiceGrpc() {}

  public static final String SERVICE_NAME = "rmit.lybao.grpc.PatientAptService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rmit.lybao.grpc.EmptyRequest,
      rmit.lybao.grpc.ShortMess> getGetShortMessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShortMess",
      requestType = rmit.lybao.grpc.EmptyRequest.class,
      responseType = rmit.lybao.grpc.ShortMess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rmit.lybao.grpc.EmptyRequest,
      rmit.lybao.grpc.ShortMess> getGetShortMessMethod() {
    io.grpc.MethodDescriptor<rmit.lybao.grpc.EmptyRequest, rmit.lybao.grpc.ShortMess> getGetShortMessMethod;
    if ((getGetShortMessMethod = PatientAptServiceGrpc.getGetShortMessMethod) == null) {
      synchronized (PatientAptServiceGrpc.class) {
        if ((getGetShortMessMethod = PatientAptServiceGrpc.getGetShortMessMethod) == null) {
          PatientAptServiceGrpc.getGetShortMessMethod = getGetShortMessMethod =
              io.grpc.MethodDescriptor.<rmit.lybao.grpc.EmptyRequest, rmit.lybao.grpc.ShortMess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetShortMess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rmit.lybao.grpc.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rmit.lybao.grpc.ShortMess.getDefaultInstance()))
              .setSchemaDescriptor(new PatientAptServiceMethodDescriptorSupplier("GetShortMess"))
              .build();
        }
      }
    }
    return getGetShortMessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rmit.lybao.grpc.EmptyRequest,
      rmit.lybao.grpc.DataList> getGetMediumMessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMediumMess",
      requestType = rmit.lybao.grpc.EmptyRequest.class,
      responseType = rmit.lybao.grpc.DataList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rmit.lybao.grpc.EmptyRequest,
      rmit.lybao.grpc.DataList> getGetMediumMessMethod() {
    io.grpc.MethodDescriptor<rmit.lybao.grpc.EmptyRequest, rmit.lybao.grpc.DataList> getGetMediumMessMethod;
    if ((getGetMediumMessMethod = PatientAptServiceGrpc.getGetMediumMessMethod) == null) {
      synchronized (PatientAptServiceGrpc.class) {
        if ((getGetMediumMessMethod = PatientAptServiceGrpc.getGetMediumMessMethod) == null) {
          PatientAptServiceGrpc.getGetMediumMessMethod = getGetMediumMessMethod =
              io.grpc.MethodDescriptor.<rmit.lybao.grpc.EmptyRequest, rmit.lybao.grpc.DataList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMediumMess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rmit.lybao.grpc.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rmit.lybao.grpc.DataList.getDefaultInstance()))
              .setSchemaDescriptor(new PatientAptServiceMethodDescriptorSupplier("GetMediumMess"))
              .build();
        }
      }
    }
    return getGetMediumMessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rmit.lybao.grpc.EmptyRequest,
      rmit.lybao.grpc.DataList> getGetLargeMEssMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLargeMEss",
      requestType = rmit.lybao.grpc.EmptyRequest.class,
      responseType = rmit.lybao.grpc.DataList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rmit.lybao.grpc.EmptyRequest,
      rmit.lybao.grpc.DataList> getGetLargeMEssMethod() {
    io.grpc.MethodDescriptor<rmit.lybao.grpc.EmptyRequest, rmit.lybao.grpc.DataList> getGetLargeMEssMethod;
    if ((getGetLargeMEssMethod = PatientAptServiceGrpc.getGetLargeMEssMethod) == null) {
      synchronized (PatientAptServiceGrpc.class) {
        if ((getGetLargeMEssMethod = PatientAptServiceGrpc.getGetLargeMEssMethod) == null) {
          PatientAptServiceGrpc.getGetLargeMEssMethod = getGetLargeMEssMethod =
              io.grpc.MethodDescriptor.<rmit.lybao.grpc.EmptyRequest, rmit.lybao.grpc.DataList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLargeMEss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rmit.lybao.grpc.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rmit.lybao.grpc.DataList.getDefaultInstance()))
              .setSchemaDescriptor(new PatientAptServiceMethodDescriptorSupplier("GetLargeMEss"))
              .build();
        }
      }
    }
    return getGetLargeMEssMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientAptServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientAptServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientAptServiceStub>() {
        @java.lang.Override
        public PatientAptServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientAptServiceStub(channel, callOptions);
        }
      };
    return PatientAptServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientAptServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientAptServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientAptServiceBlockingStub>() {
        @java.lang.Override
        public PatientAptServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientAptServiceBlockingStub(channel, callOptions);
        }
      };
    return PatientAptServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientAptServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientAptServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientAptServiceFutureStub>() {
        @java.lang.Override
        public PatientAptServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientAptServiceFutureStub(channel, callOptions);
        }
      };
    return PatientAptServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PatientAptServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * retrives patient profile by patient ID for appointment service
     * </pre>
     */
    public void getShortMess(rmit.lybao.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<rmit.lybao.grpc.ShortMess> responseObserver) {
      asyncUnimplementedUnaryCall(getGetShortMessMethod(), responseObserver);
    }

    /**
     */
    public void getMediumMess(rmit.lybao.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<rmit.lybao.grpc.DataList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMediumMessMethod(), responseObserver);
    }

    /**
     */
    public void getLargeMEss(rmit.lybao.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<rmit.lybao.grpc.DataList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLargeMEssMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetShortMessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rmit.lybao.grpc.EmptyRequest,
                rmit.lybao.grpc.ShortMess>(
                  this, METHODID_GET_SHORT_MESS)))
          .addMethod(
            getGetMediumMessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rmit.lybao.grpc.EmptyRequest,
                rmit.lybao.grpc.DataList>(
                  this, METHODID_GET_MEDIUM_MESS)))
          .addMethod(
            getGetLargeMEssMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rmit.lybao.grpc.EmptyRequest,
                rmit.lybao.grpc.DataList>(
                  this, METHODID_GET_LARGE_MESS)))
          .build();
    }
  }

  /**
   */
  public static final class PatientAptServiceStub extends io.grpc.stub.AbstractAsyncStub<PatientAptServiceStub> {
    private PatientAptServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientAptServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientAptServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * retrives patient profile by patient ID for appointment service
     * </pre>
     */
    public void getShortMess(rmit.lybao.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<rmit.lybao.grpc.ShortMess> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetShortMessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMediumMess(rmit.lybao.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<rmit.lybao.grpc.DataList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMediumMessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLargeMEss(rmit.lybao.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<rmit.lybao.grpc.DataList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLargeMEssMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientAptServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PatientAptServiceBlockingStub> {
    private PatientAptServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientAptServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientAptServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * retrives patient profile by patient ID for appointment service
     * </pre>
     */
    public rmit.lybao.grpc.ShortMess getShortMess(rmit.lybao.grpc.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetShortMessMethod(), getCallOptions(), request);
    }

    /**
     */
    public rmit.lybao.grpc.DataList getMediumMess(rmit.lybao.grpc.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMediumMessMethod(), getCallOptions(), request);
    }

    /**
     */
    public rmit.lybao.grpc.DataList getLargeMEss(rmit.lybao.grpc.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLargeMEssMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientAptServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PatientAptServiceFutureStub> {
    private PatientAptServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientAptServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientAptServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * retrives patient profile by patient ID for appointment service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<rmit.lybao.grpc.ShortMess> getShortMess(
        rmit.lybao.grpc.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetShortMessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rmit.lybao.grpc.DataList> getMediumMess(
        rmit.lybao.grpc.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMediumMessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rmit.lybao.grpc.DataList> getLargeMEss(
        rmit.lybao.grpc.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLargeMEssMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SHORT_MESS = 0;
  private static final int METHODID_GET_MEDIUM_MESS = 1;
  private static final int METHODID_GET_LARGE_MESS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientAptServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientAptServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SHORT_MESS:
          serviceImpl.getShortMess((rmit.lybao.grpc.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<rmit.lybao.grpc.ShortMess>) responseObserver);
          break;
        case METHODID_GET_MEDIUM_MESS:
          serviceImpl.getMediumMess((rmit.lybao.grpc.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<rmit.lybao.grpc.DataList>) responseObserver);
          break;
        case METHODID_GET_LARGE_MESS:
          serviceImpl.getLargeMEss((rmit.lybao.grpc.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<rmit.lybao.grpc.DataList>) responseObserver);
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

  private static abstract class PatientAptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientAptServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rmit.lybao.grpc.TestData.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientAptService");
    }
  }

  private static final class PatientAptServiceFileDescriptorSupplier
      extends PatientAptServiceBaseDescriptorSupplier {
    PatientAptServiceFileDescriptorSupplier() {}
  }

  private static final class PatientAptServiceMethodDescriptorSupplier
      extends PatientAptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientAptServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PatientAptServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientAptServiceFileDescriptorSupplier())
              .addMethod(getGetShortMessMethod())
              .addMethod(getGetMediumMessMethod())
              .addMethod(getGetLargeMEssMethod())
              .build();
        }
      }
    }
    return result;
  }
}
