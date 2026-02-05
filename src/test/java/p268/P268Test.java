package p268;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p268.P268.missingNumber;


public class P268Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{3,0,1}, 2),
                Arguments.of(new int[]{0,1}, 2),
                Arguments.of(new int[]{0,2}, 1),
                Arguments.of(new int[]{9,6,4,2,3,5,7,0,1}, 8),
                Arguments.of(new int[]{0}, 1),
                Arguments.of(new int[]{1,2}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testMissingNumber(int[] values, int result){

        Assertions.assertEquals(result, missingNumber(values));

    }
}
