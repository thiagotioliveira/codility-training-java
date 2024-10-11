package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    private CountDiv countDiv = new CountDiv();

    @Test
    void testAIsLessThan0() {
        assertThrows(IllegalArgumentException.class, () -> countDiv.solution(-1, 5, 5));
    }

    @Test
    void testAIsMoreThan2000000000() {
        assertThrows(IllegalArgumentException.class, () -> countDiv.solution(2000000001, 5, 5));
    }

    @Test
    void testBIsLessThan0() {
        assertThrows(IllegalArgumentException.class, () -> countDiv.solution(5, -1, 5));
    }

    @Test
    void testBIsMoreThan2000000000() {
        assertThrows(IllegalArgumentException.class, () -> countDiv.solution(5, 2000000001, 5));
    }

    @Test
    void testKIsLessThan1() {
        assertThrows(IllegalArgumentException.class, () -> countDiv.solution(5, 6, 0));
    }

    @Test
    void testKIsMoreThan2000000000() {
        assertThrows(IllegalArgumentException.class, () -> countDiv.solution(5, 6, 2000000001));
    }

    @Test
    void testAIsMoreThanB() {
        assertThrows(IllegalArgumentException.class, () -> countDiv.solution(5, 4, 5));
    }

    @Test
    void test() {
        assertEquals(3, countDiv.solution(6, 11, 2));
    }

}