package p349;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.prokys.p349.P349.intersection;
import static org.prokys.p349.P349.intersection2;

public class P349Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,2,1}, new int[]{2,2}, new int[]{2}),
                Arguments.of(new int[]{4,9,5}, new int[]{9,4,9,8,4}, new int[]{9,4}),
                Arguments.of(new int[]{}, new int[]{}, new int[]{}),
                Arguments.of(new int[]{1}, new int[]{}, new int[]{}),
                Arguments.of(new int[]{}, new int[]{1}, new int[]{}),
                Arguments.of(new int[]{1}, new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{1,1,1,1,1,1,1,1,1,1}, new int[]{1,1,1,1,1,1,1,1,1,1}, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testIntersection(int[] nums1, int[] nums2,int[] result){

        int[] intersections = intersection(nums1, nums2);

        for (int intersection : intersections) {
            Assertions.assertTrue(Arrays.stream(result).anyMatch(x -> x == intersection));
        }

    }

    @ParameterizedTest
    @MethodSource("data")
    public void testIntersection2(int[] nums1, int[] nums2,int[] result){

        int[] intersections = intersection2(nums1, nums2);

        for (int intersection : intersections) {
            Assertions.assertTrue(Arrays.stream(result).anyMatch(x -> x == intersection));
        }

    }
}
