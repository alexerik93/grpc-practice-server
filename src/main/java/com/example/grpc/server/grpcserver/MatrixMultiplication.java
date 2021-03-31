package com.example.grpc.server.grpcserver;

import com.example.grpc.server.grpcserver.MMultServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import java.util.*;

public class MatrixMultiplication {

    public static int[][] topRight(int m1[][]){
        int l1 = m1.length;
        int l2 = l1 / 2;
        int m2[][] = new int[l2][l2];
        for (int i = 0; i<l2; i++){
            for (int j = 0; j<l2; j++){
                m2[i][j] = m1[i][j];
            }
        }
        return m2;
    }

    public static int[][] topLeft(int m1[][]){
        int l1 = m1.length;
        int l2 = l1 / 2;
        int m2[][] = new int[l2][l2];
        for (int i = 0; i<l2; i++){
            for (int j = 0; j<l2; j++){
                m2[i][j] = m1[i+l2][j];
            }
        }
        return m2;
    }

    public static int[][] bottomRight(int m1[][]){
        int l1 = m1.length;
        int l2 = l1 / 2;
        int m2[][] = new int[l2][l2];
        for (int i = 0; i<l2; i++){
            for (int j = 0; j<l2; j++){
                m2[i][j] = m1[i][j+l2];
            }
        }
        return m2;
    }

    public static int[][] bottomLeft(int m1[][]){
        int l1 = m1.length;
        int l2 = l1 / 2;
        int m2[][] = new int[l2][l2];
        for (int i = 0; i<l2; i++){
            for (int j = 0; j<l2; j++){
                m2[i][j] = m1[i+l2][j+l2];
            }
        }
        return m2;
    }

    public static int[][] directMMult(int m1[][], int m2[][]){
        int l = m1.length;
        int m3[][] = new int[l][l];
        for (int i = 0; i<l; i++){
            for (int j = 0; j<l; j++){
                int dotProductSum = 0;
                for (int k = 0; k<l; k++){
                    int dotProduct = m1[i][k] * m2[k][j];
                    dotProductSum = dotProductSum + dotProduct;
                }
                m3[i][j] = dotProductSum;
            }
        }
        return m3;
    }

    public static int[][] cocatenate(int[][] topRight, int[][] topLeft, int[][] bottomRight, int[][] bottomLeft){
        int l = topRight.length;
        int l2 = l * 2;
        int result[][] = new int[l2][l2];
        for (int i = 0; i<l2; i++){
            for (int j = 0; j<l2; j++){
                if (i < l){
                    if (j < l){
                        result[i][j] = topRight[i][j];
                    }
                    if (j >= l){
                        result[i][j] = topLeft[i][j-l];
                    }
                }
                else {
                    if (j < l){
                        result[i][j] = topRight[i-l][j];
                    }
                    if (j >= l){
                        result[i][j] = topLeft[i-l][j-l];
                    }
                }
            }
        }
        return result;
    }

    public static int[][] mAdd(int[][] m1, int[][] m2){
        int l = m1.length;
        int result[][] = new int[l][l];
        for (int i = 0; i<l; i++){
            for (int j = 0; j<l; j++){
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] iterativeMMult(int m1[][], int m2[][]){
        int l = m1.length;
        int result[][] = new int[l][l];
        int m3[][] = new int[l][l];
        int l2 = l/2;
        int m1TopRight[][] = new int[l2][l2];
        int m1TopLeft[][] = new int[l2][l2];
        int m1BottomRight[][] = new int[l2][l2];
        int m1BottomLeft[][] = new int[l2][l2];
        int m2TopRight[][] = new int[l2][l2];
        int m2TopLeft[][] = new int[l2][l2];
        int m2BottomRight[][] = new int[l2][l2];
        int m2BottomLeft[][] = new int[l2][l2];
        m1TopRight = topRight(m1);
        m1TopLeft = topLeft(m1);
        m1BottomRight = bottomRight(m1);
        m1BottomLeft = bottomLeft(m1);
        m2TopRight = topRight(m2);
        m2TopLeft = topLeft(m2);
        m2BottomRight = bottomRight(m2);
        m2BottomLeft = bottomLeft(m2);
        if (l <= 4){
            result = directMMult(m1, m2);
        }
        else {
            int newTopRight[][] = new int[l2][l2];
            newTopRight = mAdd(iterativeMMult(m1TopRight, m2TopRight), iterativeMMult(m1TopLeft, m2BottomRight));
            int newTopLeft[][] = new int[l2][l2];
            newTopLeft = mAdd(iterativeMMult(m1TopRight, m2TopLeft), iterativeMMult(m1TopLeft, m2BottomLeft));
            int newBottomRight[][] = new int[l2][l2];
            newBottomRight = mAdd(iterativeMMult(m1BottomRight, m2TopRight), iterativeMMult(m1BottomLeft, m2BottomRight));
            int newBottomLeft[][] = new int[l2][l2];
            newBottomLeft = mAdd(iterativeMMult(m1BottomLeft, m2TopLeft), iterativeMMult(m1BottomLeft, m2BottomLeft));
            result = cocatenate(newTopRight, newTopLeft, newBottomRight, newBottomLeft);
        }
        return result;
    } 
}



