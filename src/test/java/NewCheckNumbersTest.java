import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewCheckNumbersTest {

    @Test
    void when_first_number_is_bigger_than_second_number(){
        int value1 = 10;
        int value2 = 7;
        int expected = 17;
        int result = NewCheckNumbers.sumSquareOrSubstract(value1, value2);
        assertEquals(expected,result);
    }
    @Test
    void when_result_is_sum_of_numbers(){
        int value1 = 10;
        int value2 = 7;
        int expected = 17;
        int result = NewCheckNumbers.sumSquareOrSubstract(value1, value2);
        assertEquals(expected,result);
    }
}
