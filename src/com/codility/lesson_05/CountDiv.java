package com.codility.lesson_05;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int b = B / K;
        int a = (A > 0 ? (A - 1) / K : 0);
        if (A == 0) {
            b++;
        }
        return b - a;
    }

}
