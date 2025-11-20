package p203;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.prokys.p203.P203.removeElements;
import org.prokys.utils.ListNode;

import java.util.Arrays;
import java.util.stream.Stream;

public class P203Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,6,3,4,5,6}, 6, new int[]{1,2,3,4,5}),
                Arguments.of(new int[]{},1, new int[]{}),
                Arguments.of(new int[]{7,7,7,7},7, new int[]{}),
                Arguments.of(new int[]{7,7,7,6},7, new int[]{6}),
                Arguments.of(new int[]{7,7,7,6},0, new int[]{7,7,7,6})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testRemoveElements(int[] data, int removeValue, int[] result){
        ListNode node = ListNode.fromArray(data);

        ListNode removedNode = removeElements(node, removeValue);

        Assertions.assertEquals(Arrays.equals(ListNode.toArray(removedNode), result), true);
    }
}
