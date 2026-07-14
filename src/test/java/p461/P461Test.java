package p461;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p461.P461.hammingDistance;

public class P461Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 4, 2),
                Arguments.of(3, 1, 1),
                Arguments.of(1, 1, 0),
                Arguments.of(0, 1, 1)

        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testHammingDistance(int input, int input2, int result){
        Assertions.assertEquals(result, hammingDistance(input, input2));
    }
}
