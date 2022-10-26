package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTestneg {

    @Test
    void sum_should_return_incorrect_result() {
        int a = 1;
        int b = 1;
        int expectedResult = 3;
        int result = Sum.sum(a,b);
        assertNotEquals(expectedResult,result);
    }
}