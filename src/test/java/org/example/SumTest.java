package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SumTest {

    @Test
    void sum() {
        int a = 1;
        int b = 1;
        int expectedResult = 3;
        int result = Sum.sum(a,b);
        assertEquals(expectedResult,result);
    }
}