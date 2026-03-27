package p414;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p414.P414.thirdMax;

public class P414Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{3,2,1}, 1),
                Arguments.of(new int[]{1,2}, 2),
                Arguments.of(new int[]{2,2,3,1}, 1),
                Arguments.of(new int[]{1,1,1,1,1,1}, 1),
                Arguments.of(new int[]{-1,-2,-3}, -3),
                Arguments.of(new int[]{-1,0,3}, -1),
                Arguments.of(new int[]{-1,-2,-3,0,5,6}, 0),
                Arguments.of(new int[]{-21212311,0,2323154}, -21212311),
                Arguments.of(new int[]{-21212311,-21212311,-21212311,0,0,0,0,2323154,2323154,2323154}, -21212311),
                Arguments.of(new int[]{1,2,-2147483648}, -2147483648),
                Arguments.of(new int[]{1,-2147483648}, 1),
                Arguments.of(new int[]{-2147483648,1,2}, -2147483648),
                Arguments.of(new int[]{2,-2147483648,1}, -2147483648)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testThirdMax(int[] input, int result){
        Assertions.assertEquals(result, thirdMax(input));
    }
}
