import NewCheck.NewCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewCheckTest {
    @Test
    void when_number_is_smaller_than_zero(){
        int number = -1;
        boolean expected = true;
        boolean result = NewCheck.smallerThanZero(number);
        assertEquals(expected,result);
    }
}
