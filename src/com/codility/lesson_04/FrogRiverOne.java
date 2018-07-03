package com.codility.lesson_04;

import java.util.*;

public class FrogRiverOne {
    public int solution(int x, int[] A) {
        Set<Integer> sets = new HashSet<>();
        int pos = 0;

        for(int i = 0; i < A.length; i++) {
            sets.add(A[i]);
            if(A[i] == pos + 1) {
                pos++;
                for(int j = pos + 1; j <= x; j++){
                    if(sets.contains(j)){
                        pos = j;
                    } else {
                        break;
                    }
                }
            }

            if(pos == x)
                return i;
        }
        return -1;
    }
}
