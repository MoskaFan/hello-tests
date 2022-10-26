import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumberTest {

    @Test
    void check() {

        int value = 20;
        boolean expectedResult = true;
        boolean result = CheckNumber.check(value);
        assertEquals(expectedResult,result);
    }
}