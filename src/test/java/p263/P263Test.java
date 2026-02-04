package p263;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p263.P263.isUgly;

public class P263Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(6, true),
                Arguments.of(1, true),
                Arguments.of(14, false),
                Arguments.of(2, true),
                Arguments.of(0, false),
                Arguments.of(2147483647, false),
                Arguments.of(-2147483647, false),
                Arguments.of(-1, false),
                Arguments.of(3, true)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testIsUgly(int values, boolean result){

        Assertions.assertEquals(result, isUgly(values));

    }
}
