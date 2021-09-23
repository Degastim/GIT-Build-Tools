package com.epam.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    StringUtils classUnderTest = new StringUtils();

    @Test
    void isPositiveNumber() {
        String checkString = "123";
        assertTrue(classUnderTest.isPositiveNumber(checkString));
    }

    @Test
    void isNegativeNumber() {
        String checkString = "-123";
        assertFalse(classUnderTest.isPositiveNumber(checkString));
    }
}
