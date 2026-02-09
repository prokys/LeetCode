package p283;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p283.P283.moveZeroes;


public class P283Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{0,1,0,3,12}, new int[]{1,3,12,0,0}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{0,0,0,0,0}, new int[]{0,0,0,0,0}),
                Arguments.of(new int[]{0,0,0,0,1}, new int[]{1,0,0,0,0}),
                Arguments.of(new int[]{-10,-20,0,0,1}, new int[]{-10,-20,1,0,0}),
                Arguments.of(new int[]{0,1,0,1,0,1,0}, new int[]{1,1,1,0,0,0,0})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testMoveZeros(int[] values, int[] result){

        moveZeroes(values);

        Assertions.assertArrayEquals(result, values);
    }
}
