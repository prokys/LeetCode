package p405;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p405.P405.toHex;

public class P405Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(26, "1a"),
                Arguments.of(16, "10"),
                Arguments.of(15, "f"),
                Arguments.of(17, "11"),
                Arguments.of(2147483647, "7fffffff"),
                Arguments.of(2600, "a28"),
                Arguments.of(-1, "ffffffff"),
                Arguments.of(-2147483648, "80000000"),
                Arguments.of(-2147483647, "80000001"),
                Arguments.of(-2, "fffffffe")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testToHex(int input, String result){
        Assertions.assertEquals(result, toHex(input));
    }
}
