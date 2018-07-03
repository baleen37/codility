package com.codility.lesson_05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    @Test
    void solution() {
        CountDiv cd = new CountDiv();
        assertEquals(3, cd.solution(6, 11, 2));
    }

    @Test
    void smallCase() {
        CountDiv cd = new CountDiv();
        assertEquals(2, cd.solution(0, 1, 1));
        assertEquals(1, cd.solution(0, 1, 2));
    }

    @Test
    void largeCase() {
        CountDiv cd = new CountDiv();
        assertEquals(2000000001, cd.solution(0, 2000000000, 1));
        assertEquals(2000000000, cd.solution(1, 2000000000, 1));
        assertEquals(1000000000, cd.solution(1, 2000000000, 2));
        assertEquals(1, cd.solution(2000000000, 2000000000, 2));
    }

}
