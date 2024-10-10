package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJmpTest {

    private FrogJmp frogJmp = new FrogJmp();

    @Test
    void testXIsLessThan1(){
        assertThrows(IllegalArgumentException.class, () -> frogJmp.solution(0, 1, 1));
    }

    @Test
    void testXIsMoreThan1000000000(){
        assertThrows(IllegalArgumentException.class, () -> frogJmp.solution(1000000001, 1, 1));
    }
    @Test
    void testYIsLessThan1(){
        assertThrows(IllegalArgumentException.class, () -> frogJmp.solution(1, 0, 1));
    }

    @Test
    void testYIsMoreThan1000000000(){
        assertThrows(IllegalArgumentException.class, () -> frogJmp.solution(1, 1000000001, 1));
    }
    @Test
    void testDIsLessThan1(){
        assertThrows(IllegalArgumentException.class, () -> frogJmp.solution(1, 1, 0));
    }

    @Test
    void testDIsMoreThan1000000000(){
        assertThrows(IllegalArgumentException.class, () -> frogJmp.solution(1, 1, 1000000001));
    }

    @Test
    void testXIsMoreThanY(){
        assertThrows(IllegalArgumentException.class, () -> frogJmp.solution(2, 1, 1));
    }

    @Test
    void test(){
        assertEquals(3, frogJmp.solution(10, 85, 30));
    }
}