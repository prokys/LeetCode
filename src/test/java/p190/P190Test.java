package p190;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.prokys.p190.P190.*;

public class P190Test {


    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "2, 1073741824",
            "43261596, 964176192",
            "2147483644, 1073741822",
            "2147483646, 2147483646"
    })
    public void testReverseBits(int input, int result){
        Assertions.assertEquals(result, reverseBits(input));
    }
}
