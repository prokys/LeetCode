package p338;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p338.P338.countBits;
import static org.prokys.p338.P338.countBits1;

public class P338Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, new int[]{0,1}),
                Arguments.of(2, new int[]{0,1,1}),
                Arguments.of(3, new int[]{0,1,1,2}),
                Arguments.of(4, new int[]{0,1,1,2,1}),
                Arguments.of(5, new int[]{0,1,1,2,1,2})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testCountBits(int n, int[] result){

        Assertions.assertArrayEquals(result, countBits(n));
        Assertions.assertArrayEquals(result, countBits1(n));
    }
}
