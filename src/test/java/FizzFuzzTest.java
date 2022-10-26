import FizzFuzz.FizzFuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FizzFuzzTest {
    @Test
    void when_number_returns_string(){
        int number = 4;
        String expectedResult = "4";

        //When
        String result = FizzFuzz.fizzbuzz(number);
                //Then
        assertEquals(expectedResult, result);
    }



    @Test
    void when_normal_number_multiple_of_3_output_fizz(){
        int number = 9;

        String expectedResult = "fuzz";
        //When
        String result = FizzFuzz.fizzbuzz(number);
        //Then
        assertEquals(expectedResult, result);
    }
    @Test
    void when_normal_number_multiple_of_5_output_buzz(){
        int number = 10;

        String expectedResult = "buzz";
        //When
        String result = FizzFuzz.fizzbuzz(number);
        //Then
        assertEquals(expectedResult, result);
    }
    @Test
    void when_normal_number_multiple_of_5_and_3_output_fizzbuzz(){
        int number = 15;

        String expectedResult = "fizzbuzz";
        //When
        String result = FizzFuzz.fizzbuzz(number);
        //Then
        assertEquals(expectedResult, result);
    }
    @Test
    void when_normal_number_is_15000000_multiple_of_5_and_3_output_fizzbuzz(){
        int number = 15000000;

        String expectedResult = "fizzbuzz";
        //When
        String result = FizzFuzz.fizzbuzz(number);
        //Then
        assertEquals(expectedResult, result);
    }
    @Test
    void when_normal_number_is_14000000_multiple_of_5_and_3_output_fizzbuzz(){
        int number = 14000000;

        String expectedResult = "buzz";
        //When
        String result = FizzFuzz.fizzbuzz(number);
        //Then
        assertEquals(expectedResult, result);
    }
    @Test
    void special_case_0(){
        int number = 0;

        String expectedResult = "0";
        //When
        String result = FizzFuzz.fizzbuzz(number);
        //Then
        assertEquals(expectedResult, result);
    }

}
