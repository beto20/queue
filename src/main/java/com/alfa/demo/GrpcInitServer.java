package com.alfa.demo;

import io.grpc.*;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class GrpcInitServer {

    private final Server server;

    private GrpcInitServer(Server server) {
        this.server = server;
    }

    public static GrpcInitServer create(BindableService... services) {
        return create(9090, services);
    }

    public static GrpcInitServer create(int port, BindableService... services) {
        return create(port, builder -> {
            Arrays.asList(services).forEach(builder::addService);
        });
    }

    public static GrpcInitServer create(int port, Consumer<NettyServerBuilder> consumer) {
        var builder = ServerBuilder.forPort(port);

        consumer.accept((NettyServerBuilder) builder);

        return new GrpcInitServer(builder.build());
    }

    public GrpcInitServer start() {
        var services = server.getServices()
                .stream()
                .map(ServerServiceDefinition::getServiceDescriptor)
                .map(ServiceDescriptor::getName)
                .collect(Collectors.toList());

        try {
            server.start();
            System.out.println("server started. port: " + server.getPort() +" services: " + services);
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void await() {
        try {
            server.awaitTermination();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void stop() {
        server.shutdownNow();
        System.out.println("Server stopped");
    }
}
