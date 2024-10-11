package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    private MissingInteger missingInteger = new MissingInteger();

    @Test
    void testNIsLessThan1() {
        assertThrows(IllegalArgumentException.class, () -> missingInteger.solution(new int[]{}));
    }

    @Test
    void testNIsMoreThan100000() {
        assertThrows(IllegalArgumentException.class, () -> missingInteger.solution(new int[100001]));
    }

    @Test
    void testThereIsElementLessThan1000000Negative() {
        assertThrows(IllegalArgumentException.class, () -> missingInteger.solution(new int[]{-1000001}));
    }

    @Test
    void testThereIsElementMoreThan1000000() {
        assertThrows(IllegalArgumentException.class, () -> missingInteger.solution(new int[]{1000001}));
    }

    @Test
    void test() {
        assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(4, missingInteger.solution(new int[]{1, 2, 3}));
        assertEquals(1, missingInteger.solution(new int[]{-1, -3}));
    }
}