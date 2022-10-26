package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTestmain {

    @Test
    void sum() {
        int a = 1;
        int b = 1;
        int expectedResult = 3;
        int result = Sum.sum(a,b);
        assertNotEquals(expectedResult,result);
    }
}