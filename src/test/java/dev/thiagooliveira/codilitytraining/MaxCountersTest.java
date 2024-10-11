package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    private MaxCounters maxCounters = new MaxCounters();

    @Test
    void testNIsLessThan1(){
        assertThrows(IllegalArgumentException.class, () -> maxCounters.solution(0, new int[]{5}));
    }

    @Test
    void testNIsMoreThan100000(){
        assertThrows(IllegalArgumentException.class, () -> maxCounters.solution(100001, new int[]{5}));
    }

    @Test
    void testMIsLessThan1(){
        assertThrows(IllegalArgumentException.class, () -> maxCounters.solution(5, new int[]{}));
    }

    @Test
    void testMIsMoreThan100000(){
        assertThrows(IllegalArgumentException.class, () -> maxCounters.solution(5, new int[100001]));
    }

    @Test
    void testThereIsElementLessThan1(){
        assertThrows(IllegalArgumentException.class, () -> maxCounters.solution(5, new int[]{0}));
    }

    @Test
    void testThereIsElementMoreThanNPlus1(){
        assertThrows(IllegalArgumentException.class, () -> maxCounters.solution(5, new int[]{7}));
    }

    @Test
    void test() {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }



}