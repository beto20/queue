package com.alfa.demo;

import com.example.pub.MessageRequest;
import io.grpc.stub.StreamObserver;

public class MessageHandler implements StreamObserver<MessageRequest> {
    private final StreamObserver<MessageRequest> requestObserver;

    public MessageHandler(StreamObserver<MessageRequest> requestObserver) {
        this.requestObserver = requestObserver;
    }

    @Override
    public void onNext(MessageRequest value) {
        System.out.println("ON NEXT" + value.getBody());
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("Client error: " + t.getMessage());
    }

    @Override
    public void onCompleted() {
        var message = MessageRequest.newBuilder()
                .setBody("PRUEBA")
                .setHeader("CABECERA")
                .setPriority("HIGH_PRIORITY")
                .build();

        this.requestObserver.onNext(message);
        this.requestObserver.onCompleted();
    }
}
