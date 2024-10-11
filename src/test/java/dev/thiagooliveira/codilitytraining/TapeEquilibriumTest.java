package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {

    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    void testNLessThan2() {
        assertThrows(IllegalArgumentException.class, () -> tapeEquilibrium.solution(new int[1]));
    }

    @Test
    void testNMoreThan100000() {
        assertThrows(IllegalArgumentException.class, () -> tapeEquilibrium.solution(new int[100001]));
    }

    @Test
    void testThereIsElementLessThan1000Negative() {
        assertThrows(IllegalArgumentException.class, () -> tapeEquilibrium.solution(new int[]{-1001}));
    }

    @Test
    void testThereIsElementMoreThan1000() {
        assertThrows(IllegalArgumentException.class, () -> tapeEquilibrium.solution(new int[]{1001}));
    }

    @Test
    void test() {
        assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
    }
}