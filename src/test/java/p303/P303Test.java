package p303;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.prokys.p303.P303.sumRanges;

public class P303Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(List.of(new int[]{-2,0,3,-5,2,-1}, new int[]{0,2}, new int[]{2,5}, new int[]{0,5}), new Integer[] {null, 1, -1, -3}),
                Arguments.of(List.of(new int[]{1,2,3,4,5,6}, new int[]{0,2}, new int[]{2,5}, new int[]{0,5}), new Integer[] {null,6,18,21})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testNumArray(List<int[]> list, Integer[] result){

        Assertions.assertArrayEquals(result, sumRanges(list));
    }
}
