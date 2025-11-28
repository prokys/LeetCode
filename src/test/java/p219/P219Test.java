package p219;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p219.P219.containsNearbyDuplicate;

public class P219Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,1}, 3, true),
                Arguments.of(new int[]{1,0,1,1}, 1, true),
                Arguments.of(new int[]{1,2,3,1,2,3}, 2, false),
                Arguments.of(new int[]{1,2,1}, 1, false),
                Arguments.of(new int[]{1,2,1}, 2, true),
                Arguments.of(new int[]{1}, 1, false),
                Arguments.of(new int[]{1,1}, 1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testContainsNearbyDuplicate(int[] values, int distance, boolean result){

        Assertions.assertEquals(result, containsNearbyDuplicate(values, distance));
    }
}
