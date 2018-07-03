package com.codility.lesson_04;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] matrix = new int[N];

        int virtualBase = 0;
        int max = -1;
        //M
        for(int k = 0; k < A.length; k++){
            if(A[k] >= 1 && A[k] <= N){
                if(matrix[A[k] - 1] < virtualBase){
                    matrix[A[k] - 1] = virtualBase;
                }
                matrix[A[k] - 1]++;

                max = max > matrix[A[k] - 1] ? max : matrix[A[k] - 1];
            } else if(A[k] == N + 1) {
                virtualBase = max;
            }
        }

        //N
        for(int i = 0; i< matrix.length; i++) {
            if(matrix[i] < virtualBase){
                matrix[i] = virtualBase;
            }
        }

        return matrix;
    }
}
