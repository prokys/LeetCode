package p342;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p342.P342.isPowerOfFour;

public class P342Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(16, true),
                Arguments.of(5, false),
                Arguments.of(1, true),
                Arguments.of(-1, false),
                Arguments.of(-4, false),
                Arguments.of(4, true),
                Arguments.of(32, false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testIsPowerOfFour(int n, boolean result){

        Assertions.assertEquals(result, isPowerOfFour(n));
    }
}
