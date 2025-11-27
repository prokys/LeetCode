package p191;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.prokys.p191.P191.hammingWeight;

public class P191Test {


    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "11, 3",
            "128, 1",
            "2147483645, 30",
            "2147483647, 31",
    })
    public void testReverseBits(int input, int result){
        Assertions.assertEquals(result, hammingWeight(input));
    }
}
