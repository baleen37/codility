package com.codility;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermCheckTest {

    @Test
    void solution() {
        PermCheck pc = new PermCheck();
        assertEquals(1, pc.solution(new int[]{4,3,2,1}));
        assertEquals(0, pc.solution(new int[]{4,3,1}));
    }

    @Test
    void smallCase(){
        PermCheck pc = new PermCheck();
        assertEquals(1, pc.solution(new int[]{1}));
        assertEquals(0, pc.solution(new int[]{2}));
        assertEquals(1, pc.solution(new int[]{}));
    }
}