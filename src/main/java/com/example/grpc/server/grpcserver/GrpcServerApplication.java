package com.example.grpc.server.grpcserver;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
public class GrpcServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GrpcServerApplication.class, args);
		// Server server = ServerBuilder.forPort(8080).addService(new MMultServiceImpl()).build();
		// server.start();
		// server.awaitTermination();
	}

}
