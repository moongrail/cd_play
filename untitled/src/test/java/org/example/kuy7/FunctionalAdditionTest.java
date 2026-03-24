package org.example.kuy7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionalAdditionTest {
    @Test
    public void simpleAdd() {
        assertEquals(FunctionalAddition.add(3).applyAsInt(5), 8);
    }
}