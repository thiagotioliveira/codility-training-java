package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    private BinaryGap binaryGap = new BinaryGap();

    @Test
    void testNNegative() {
        assertThrows(IllegalArgumentException.class, () -> binaryGap.solution(-1));
    }

    @Test
    void testNZero() {
        assertThrows(IllegalArgumentException.class, () -> binaryGap.solution(0));
    }

    @Test
    void test(){
        assertEquals(2, binaryGap.solution(9));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(1, binaryGap.solution(20));
        assertEquals(0, binaryGap.solution(15));
        assertEquals(0, binaryGap.solution(32));
        assertEquals(5, binaryGap.solution(1041));
    }
}