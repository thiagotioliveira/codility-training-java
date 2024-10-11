package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {

    private PermCheck permCheck = new PermCheck();

    @Test
    void testNIsLessThan1(){
        assertThrows(IllegalArgumentException.class, () -> permCheck.solution(new int[]{}));
    }
    @Test
    void testNIsMoreThan100000(){
        assertThrows(IllegalArgumentException.class, () -> permCheck.solution(new int[100001]));
    }
    @Test
    void testThereIsElementLessThan1(){
        assertThrows(IllegalArgumentException.class, () -> permCheck.solution(new int[]{0}));
    }
    @Test
    void testThereIsElementMoreThan1000000000(){
        assertThrows(IllegalArgumentException.class, () -> permCheck.solution(new int[]{1000000001}));
    }

    @Test
    void test(){
        assertEquals(1, permCheck.solution(new int[]{4, 1, 3, 2}));
        assertEquals(0, permCheck.solution(new int[]{4, 1, 3}));
    }

}