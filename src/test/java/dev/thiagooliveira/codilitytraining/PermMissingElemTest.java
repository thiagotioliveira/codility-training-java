package dev.thiagooliveira.codilitytraining;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    private PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    void testDuplicateElements(){
        assertThrows(IllegalArgumentException.class, () -> permMissingElem.solution(new int[]{1,1}));
    }

    @Test
    void test(){
        assertEquals(4, permMissingElem.solution(new int[]{2, 3, 1, 5}));
    }

}