/*
 *  Author: OneRCH Team
 *  Project: OneRCH Project
 *  School: RMIT - University
 */
package rmit.lybao.restserver;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import rmit.lybao.grpc.DataList;
import rmit.lybao.grpc.EmptyRequest;
import rmit.lybao.grpc.PatientAptServiceGrpc;
import rmit.lybao.grpc.ShortMess;

import java.io.IOException;

@GrpcService
public class GrpcServer extends PatientAptServiceGrpc.PatientAptServiceImplBase {

    private final Service service;

    public GrpcServer(Service service) {
        this.service = service;
    }

    @Override
    public void getShortMess(EmptyRequest request, StreamObserver<ShortMess> responseObserver) {
        ShortMess shortMess = ShortMess.newBuilder().setMessage("Hello").build();
        responseObserver.onNext(shortMess);
        responseObserver.onCompleted();
    }

    @Override
    public void getMediumMess(EmptyRequest request, StreamObserver<DataList> responseObserver) {
        try {
            DataList dataList = service.readGrpcMediumData();
            responseObserver.onNext(dataList);
            responseObserver.onCompleted();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getLargeMEss(EmptyRequest request, StreamObserver<DataList> responseObserver) {
        try {
            DataList dataList = service.readGrpcLargeData();
            responseObserver.onNext(dataList);
            responseObserver.onCompleted();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
