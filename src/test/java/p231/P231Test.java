package p231;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p231.P231.isPowerOfTwo;

public class P231Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(2147483647,false),
                Arguments.of(1,true),
                Arguments.of(2,true),
                Arguments.of(16,true),
                Arguments.of(3,false),
                Arguments.of(32,true),
                Arguments.of(-1, false),
                Arguments.of(-2, false),
                Arguments.of(-4, false),
                Arguments.of(0, false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testSummaryRanges(int input, boolean result){
        Assertions.assertEquals(result, isPowerOfTwo(input));
    }
}
