package p234;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.prokys.utils.ListNode;

import java.util.stream.Stream;

import static org.prokys.p234.P234.isPalindrome;


public class P234Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,2,1}, true),
                Arguments.of(new int[]{1,2}, false),
                Arguments.of(new int[]{1}, true),
                Arguments.of(new int[]{1,2,1}, true),
                Arguments.of(new int[]{1,2,3,2,1}, true),
                Arguments.of(new int[]{1,1,1,1,1,1,2}, false),
                Arguments.of(new int[]{1,1,1,1,2,1,1}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testIsPalindrome(int[] input, boolean result){
        ListNode node = ListNode.fromArray(input);

        Assertions.assertEquals(result,isPalindrome(node));
    }
}
