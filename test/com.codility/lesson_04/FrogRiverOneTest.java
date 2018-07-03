package com.codility.lesson_04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    @Test
    void solution() {
        FrogRiverOne fr = new FrogRiverOne();
        assertEquals(6, fr.solution(5, new int[]{1,3,1,4,2,3,5,4}));
    }

    @Test
    void wrongCase() {
        FrogRiverOne fr = new FrogRiverOne();
        assertEquals(-1, fr.solution(5, new int[]{1,1,1,1,1,1,1,1}));
        assertEquals(-1, fr.solution(5, new int[]{1,5,5,5,3,2,1,1}));
    }

    @Test
    void smallCase() {
        FrogRiverOne fr = new FrogRiverOne();
        assertEquals(0, fr.solution(1, new int[]{1}));
        assertEquals(1, fr.solution(1, new int[]{2,1}));
        assertEquals(1, fr.solution(2, new int[]{1,2}));
    }

    @Test
    void mediumCase() {
        FrogRiverOne fr = new FrogRiverOne();
        assertEquals(6, fr.solution(5, new int[]{1,3,1,4,2,3,5,4,7,8,10}));
    }

    @Test
    void largeCase() {
        FrogRiverOne fr = new FrogRiverOne();

        int[] a = new int[10000001];
        for(int i = 0; i <= 10000000; i ++) {
            a[i] = i;
        }
        assertEquals(10000000, fr.solution(10000000, a));
    }
}