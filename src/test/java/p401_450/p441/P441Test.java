package p401_450.p441;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p401_450.p441.P441.arrangeCoins;

public class P441Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(5, 2),
                Arguments.of(8, 3),
                Arguments.of(99, 13),
                Arguments.of(2147483647, 65535),
                Arguments.of(2147483646, 65535),
                Arguments.of(2147483645, 65535),
                Arguments.of(2147483644, 65535),
                Arguments.of(2147483643, 65535),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testArrangeCoins(int input, int result){
        Assertions.assertEquals(result, arrangeCoins(input));
    }
}
