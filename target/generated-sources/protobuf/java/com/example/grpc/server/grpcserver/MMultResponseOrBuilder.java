// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MMultService.proto

package com.example.grpc.server.grpcserver;

public interface MMultResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.grpc.server.grpcserver.MMultResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  java.util.List<com.example.grpc.server.grpcserver.Row> 
      getMatrixCList();
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  com.example.grpc.server.grpcserver.Row getMatrixC(int index);
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  int getMatrixCCount();
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  java.util.List<? extends com.example.grpc.server.grpcserver.RowOrBuilder> 
      getMatrixCOrBuilderList();
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.Row matrixC = 1;</code>
   */
  com.example.grpc.server.grpcserver.RowOrBuilder getMatrixCOrBuilder(
      int index);
}
