package p326;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p326.P326.isPowerOfThree;

public class P326Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(27, true),
                Arguments.of(0, false),
                Arguments.of(1, true),
                Arguments.of(2, false),
                Arguments.of(3, true),
                Arguments.of(2147483645, false),
                Arguments.of(2147483647, false),
                Arguments.of(3, true),
                Arguments.of(-1, false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testIsPowerOfThree(int n, boolean result){

        Assertions.assertEquals(result, isPowerOfThree(n));
    }
}
