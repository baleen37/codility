package com.codility;

public class PermCheck {

    public int solution(int[] A) {
        boolean[] seen = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            if(A[i] < 1 || A[i] > A.length) return 0;
            if(seen[A[i]]) return 0;
            else seen[A[i]] = true;
        }

        return 1;
    }
}
