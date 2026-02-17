package p367;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p367.P367.isPerfectSquare;

public class P367Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(16, true),
                Arguments.of(14, false),
                Arguments.of(1, true),
                Arguments.of(2, false),
                Arguments.of(4, true),
                Arguments.of(17, false),
                Arguments.of(9, true),
                Arguments.of(2147483647, false)

        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testIsPerfectSquare(int num, boolean result){

        Assertions.assertEquals(result, isPerfectSquare(num));

    }
}
