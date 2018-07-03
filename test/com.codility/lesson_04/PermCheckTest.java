package com.codility.lesson_04;


import com.codility.lesson_04.PermCheck;
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

    @Test
    void mediumCase(){
        PermCheck pc = new PermCheck();
        assertEquals(1, pc.solution(new int[]{10,2,3,6,4,5,7,8,9,1}));
        assertEquals(0, pc.solution(new int[]{10,2,3,6,4,5,6,7,7,9}));
    }

    @Test
    void largeCase(){
        PermCheck pc = new PermCheck();
        int[] intArray = new int[100000];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i+1;
        }

        assertEquals(1, pc.solution(intArray));

        intArray[2] =1;
        assertEquals(0, pc.solution(intArray));
    }
}