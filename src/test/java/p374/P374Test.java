package p374;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.prokys.p374.P374;

import java.util.stream.Stream;

public class P374Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(10, 6),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(10000, 1),
                Arguments.of(1, 10000),
                Arguments.of(10000, 5000),
                Arguments.of(10000, 4999),
                Arguments.of(10000, 5001),
                Arguments.of(2147483647, 2147483647),
                Arguments.of(1, 2147483647),
                Arguments.of(1073741824, 2147483647),
                Arguments.of(1073741823, 2147483647),
                Arguments.of(1073741825, 2147483647),
                Arguments.of(2147483647, 1073741824),
                Arguments.of(2147483647, 1073741823),
                Arguments.of(2147483647, 1073741825),
                Arguments.of(2147483646, 2147483646),
                Arguments.of(1, 2147483646),
                Arguments.of(1073741824, 2147483646),
                Arguments.of(1073741823, 2147483646),
                Arguments.of(1073741825, 2147483646),
                Arguments.of(2147483646, 1073741824),
                Arguments.of(2147483646, 1073741823),
                Arguments.of(2147483646, 1073741825)

        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testGuessNumber(int num, int result){

        P374 p374 = new P374();
        p374.setPick(result);

        Assertions.assertEquals(result, p374.guessNumber(num));

    }
}
