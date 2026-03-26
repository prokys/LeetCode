package p404;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.prokys.utils.TreeNode;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.prokys.p404.P404.sumOfLeftLeaves;

public class P404Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new Integer[]{3,9,20,null,null,15,7}, 24),
                Arguments.of(new Integer[]{1}, 0),
                Arguments.of(new Integer[]{1,2,3}, 2),
                Arguments.of(new Integer[]{1,2,null,3,4,5,null,7,8,null,null,9,10,11}, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testSumOfLeftLeaves(Integer[] input, int result){
        TreeNode node = TreeNode.fromArray(input);
        Assertions.assertEquals(result, sumOfLeftLeaves(node));
    }
}
