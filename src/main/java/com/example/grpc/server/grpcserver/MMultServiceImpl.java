package com.example.grpc.server.grpcserver;


import com.example.grpc.server.grpcserver.MMultServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import java.util.*;
import com.example.grpc.server.grpcserver.MatrixMultiplication;
import java.lang.*;

@GrpcService
public class MMultServiceImpl extends MMultServiceGrpc.MMultServiceImplBase {

	public static List<Row> getRowsFromMatrix(int[][] matrix){
		List<Row> result = new ArrayList<Row>();
		for (int i = 0; i < matrix.length; i++) {
			List<Integer> rowList = new ArrayList<Integer>();	
			for (int j = 0; j < matrix[i].length; j++) {
				rowList.add(matrix[i][j]);
			}
			Row row = Row.newBuilder().addAllVal(rowList).build();
			result.add(row);
		}
		return result;
	}

	public static int[][] getMatrixFromRows(List<Row> matrix) {
		int length = matrix.size();
		int depth = 0;
		if (length > 0) {
			depth = matrix.get(0).getValCount();
		}
		int[][] intMatrix = new int[length][depth];
		int i = 0;
		int j = 0;
		for(Row a : matrix) {
			for(int b : a.getValList()) {
				if (j < depth) {
					intMatrix[i][j] = b;
					j++;
				}
			}
			j=0;
			i++;
		}
		return intMatrix;
	}

	@Override
	public void mmult(MMultRequest request, StreamObserver<MMultResponse> responseObserver) {
		System.out.println("Request recieved from client " + request);
		List<Row> matrixARows = request.getMatrixAList();
		List<Row> matrixBRows = request.getMatrixBList();
		int[][] matrixA = getMatrixFromRows(matrixARows);
		int[][] matrixB = getMatrixFromRows(matrixBRows);
		int length = matrixA.length;
		int depth = matrixB[0].length;
		int[][] matrixC = MatrixMultiplication.iterativeMMult(matrixA, matrixB);
		List<Row> matrixCRows = getRowsFromMatrix(matrixC);
		MMultResponse res = MMultResponse.newBuilder().addAllMatrixC(matrixCRows).build();
		responseObserver.onNext(res);
		responseObserver.onCompleted();
	}
}

