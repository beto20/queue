package com.alfa.demo;

import com.example.pub.MessageRequest;
import com.example.pub.MessageResponse;
import com.example.pub.MessageServiceGrpc;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

public class MessageService extends MessageServiceGrpc.MessageServiceImplBase {


//    @Override
//    public MessageResponse receiveMessage(StreamObserver<MessageRequest> responseObserver) {
////        return new MessageHandler(responseObserver);
//        return null;
//    }

    @Override
    public void receiveMessage(MessageResponse request, StreamObserver<MessageRequest> responseObserver) {
        super.receiveMessage(request, responseObserver);
    }

    @Override
    public void sendMessage(Empty request, StreamObserver<MessageRequest> responseObserver) {
        super.sendMessage(request, responseObserver);
    }
}
