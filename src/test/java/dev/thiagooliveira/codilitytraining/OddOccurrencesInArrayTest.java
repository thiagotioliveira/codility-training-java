package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    void testNIsZero(){
        assertThrows(IllegalArgumentException.class, () -> oddOccurrencesInArray.solution(new int[]{}));
    }

    @Test
    void testNIsModeThan1000000(){
        assertThrows(IllegalArgumentException.class, () -> oddOccurrencesInArray.solution(new int[1000001]));
    }

    @Test
    void testThereIsNotElementLessThanOne(){
        assertThrows(IllegalArgumentException.class, () -> oddOccurrencesInArray.solution(new int[]{0}));
    }

    @Test
    void testThereIsNotElementMoreThan1000000000(){
        assertThrows(IllegalArgumentException.class, () -> oddOccurrencesInArray.solution(new int[]{1000000001}));
    }

    @Test
    void testArrayContainsEvenNumberElements(){
        assertThrows(IllegalArgumentException.class, () -> oddOccurrencesInArray.solution(new int[]{1, 2, 3, 4}));
        assertThrows(IllegalArgumentException.class, () -> oddOccurrencesInArray.solution(new int[]{1, 2}));
    }

    @Test
    void test(){
        assertEquals(7, oddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}