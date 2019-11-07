package com.wuyang.algorithm.array.p191107;

/**
 * 描述：给定一个二维数组，将其按照矩阵转置的规则进行转换
 *
 * @author wuyang
 * @date 2019/11/7
 **/
public class TransposeMatrixTest {

    public static int[][] transposeMatrix(int[][] A) {
        if (A == null || A.length == 0) {
            return A;
        }
        int M = A.length;
        int N = A[0].length;
        int[][] result = new int[N][M];
        for (int m = 0; m < M; m++) {
            for (int n = 0; n < N; n++) {
                result[n][m] = A[m][n];
            }
        }
        return result;
    }

}
