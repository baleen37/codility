package com.codility.lesson_04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    void solution() {
        MissingInteger mi = new MissingInteger();
        assertEquals(5, mi.solution(new int[]{1,3,6,4,1,2}));
        assertEquals(4, mi.solution(new int[]{1,2,3}));
        assertEquals(1, mi.solution(new int[]{-1,-3}));
    }

    @Test
    void smallCase() {
        MissingInteger mi = new MissingInteger();
        assertEquals(1, mi.solution(new int[]{0}));
        assertEquals(1, mi.solution(new int[]{-100, 1000}));
        assertEquals(2, mi.solution(new int[]{1}));
    }
}