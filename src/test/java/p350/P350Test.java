package p350;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.prokys.p350.P350.intersect;

public class P350Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,2,1}, new int[]{2,2}, new int[]{2,2}),
                Arguments.of(new int[]{4,9,5}, new int[]{9,4,9,8,4}, new int[]{9,4}),
                Arguments.of(new int[]{}, new int[]{}, new int[]{}),
                Arguments.of(new int[]{1}, new int[]{}, new int[]{}),
                Arguments.of(new int[]{}, new int[]{1}, new int[]{}),
                Arguments.of(new int[]{1}, new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{1,1,1,1,1,1,1,1,1,1}, new int[]{1,1,1,1,1,1,1,1,1,1}, new int[]{1,1,1,1,1,1,1,1,1,1}),
                Arguments.of(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{9,8,7,6,5,4,3,2,1}, new int[]{9,8,7,6,5,4,3,2,1}),
                Arguments.of(new int[]{1,2,2,1}, new int[]{2}, new int[]{2}),
                Arguments.of(new int[]{1,2}, new int[]{1,1}, new int[]{1}),
                Arguments.of(new int[]{1,1}, new int[]{1,2}, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testIntersect(int[] nums1, int[] nums2,int[] result){

        int[] intersections = intersect(nums1, nums2);

        Assertions.assertEquals(Arrays.stream(result).sum(), Arrays.stream(intersections).sum());

    }
}
