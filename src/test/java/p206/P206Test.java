package p206;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.prokys.utils.ListNode;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.prokys.p206.P206.reverseList;

public class P206Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, new int[]{5,4,3,2,1}),
                Arguments.of(new int[]{1,2}, new int[]{2,1}),
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{1}, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testReverseList(int[] data, int[] result){
        ListNode node = ListNode.fromArray(data);

        ListNode reversedNode = reverseList(node);

        System.out.println(Arrays.toString(ListNode.toArray(reversedNode)));
        Assertions.assertEquals(true,Arrays.equals(ListNode.toArray(reversedNode), result));
    }
}
