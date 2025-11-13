package p202;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.prokys.p202.P202.isHappy;

public class P202Test {

    @ParameterizedTest
    @CsvSource({
            "1, true",
            "2, false",
            "19, true",
            "2147483647, false"
    })
    public void testIsHappy(int number, boolean result){
        Assertions.assertEquals(result, isHappy(number));
    }
}
