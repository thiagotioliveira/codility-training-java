package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    private CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    void testKMinusNegative() {
        assertThrows(IllegalArgumentException.class, () -> cyclicRotation.solution(new int[]{}, -1));
    }

    @Test
    void testKMoreThan100() {
        assertThrows(IllegalArgumentException.class, () -> cyclicRotation.solution(new int[]{}, 101));
    }

    @Test
    void testNMoreThan100() {
        assertThrows(IllegalArgumentException.class, () -> cyclicRotation.solution(new int[101], 1));
    }

    @Test
    void testArrayWithElementsMoreThan1000() {
        assertThrows(IllegalArgumentException.class, () -> cyclicRotation.solution(new int[]{1001}, 1));
    }

    @Test
    void testArrayWithElementsLessThan1000Negative() {
        assertThrows(IllegalArgumentException.class, () -> cyclicRotation.solution(new int[]{-1001}, 1));
    }

    @Test
    void testKEquals0() {
        assertArrayEquals(new int[]{3, 8, 9, 7, 6}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 0));
    }

    @Test
    void testKEqualsALength() {
        assertArrayEquals(new int[]{3, 8, 9, 7, 6}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 5));
    }

    @Test
    void test() {
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 1));
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[]{0, 0, 0}, cyclicRotation.solution(new int[]{0, 0, 0}, 1));
        assertArrayEquals(new int[]{1, 2, 3, 4}, cyclicRotation.solution(new int[]{1, 2, 3, 4}, 8));
    }

}