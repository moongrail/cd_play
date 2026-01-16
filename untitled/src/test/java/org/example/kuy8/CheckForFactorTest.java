package org.example.kuy8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckForFactorTest {
    @Test
    void basicTests() {
        Assertions.assertTrue(CheckForFactor.checkForFactor(10, 2));
        Assertions.assertTrue(CheckForFactor.checkForFactor(63, 7));
        Assertions.assertTrue(CheckForFactor.checkForFactor(2450, 5));
        Assertions.assertTrue(CheckForFactor.checkForFactor(24612, 3));
    }
}