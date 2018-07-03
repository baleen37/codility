package com.codility.lesson_04;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A) {
        int smallest = 1;

        Arrays.sort(A);

        for(int i = 0;  i < A.length; i++){
            if(A[i] < 1)
                continue;

            if(A[i] == smallest) {
                smallest = A[i] + 1;
            }
        }

        return smallest;
    }
}
