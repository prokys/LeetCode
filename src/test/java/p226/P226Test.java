package p226;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.prokys.utils.TreeNode;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.prokys.p226.P226.invertTree;

public class P226Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new Integer[]{4,2,7,1,3,6,9}, new Integer[]{4,7,2,9,6,3,1}),
                Arguments.of(new Integer[]{2,1,3}, new Integer[]{2,3,1}),
                Arguments.of(new Integer[]{}, new Integer[]{}),
                Arguments.of(new Integer[]{4,2,null,7,1,3,6,9}, new Integer[]{4,null,2,1,7,null,9,6,3}),
                Arguments.of(new Integer[]{1}, new Integer[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testInvertTree(Integer[] input, Integer[]result){
        TreeNode node = TreeNode.fromArray(input);
        Assertions.assertEquals(true ,Arrays.equals(result,TreeNode.toArray(invertTree(node))));
    }
}
