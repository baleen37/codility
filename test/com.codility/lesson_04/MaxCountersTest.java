package com.codility.lesson_04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {
    @Test
    void solution() {
        MaxCounters mc = new MaxCounters();
        assertArrayEquals(new int[]{3,2,2,4,2}, mc.solution(5, new int[]{3,4,4,6,1,4,4}));
    }

    @Test
    void smallCase() {
        MaxCounters mc = new MaxCounters();
        assertArrayEquals(new int[]{0,0,0,0,0}, mc.solution(5, new int[]{0,-1,0,0,0,0,0,0,0,0,0,0}));
        assertArrayEquals(new int[]{0}, mc.solution(1, new int[]{0}));
        assertArrayEquals(new int[]{0}, mc.solution(1, new int[]{2}));
        assertArrayEquals(new int[]{1}, mc.solution(1, new int[]{1}));
    }
}