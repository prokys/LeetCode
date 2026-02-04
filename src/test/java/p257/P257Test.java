package p257;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.prokys.utils.TreeNode;

import java.util.List;
import java.util.stream.Stream;

import static org.prokys.p257.P257.binaryTreePaths;

public class P257Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new Integer[]{1,2,3,null,5}, List.of("1->2->5","1->3")),
                Arguments.of(new Integer[]{1}, List.of("1")),
                Arguments.of(new Integer[]{1,1,1,1,1}, List.of("1->1->1","1->1->1","1->1")),
                Arguments.of(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, List.of("1->2->4->8","1->2->4->9","1->2->5->10","1->2->5->11","1->3->6->12","1->3->6->13","1->3->7->14","1->3->7->15")),
                Arguments.of(new Integer[]{1,null,3,4,5,6,7,8,9,10,11,12,13,14,15}, List.of("1->3->4->6->10","1->3->4->6->11","1->3->4->7->12","1->3->4->7->13","1->3->5->8->14","1->3->5->8->15","1->3->5->9")),
                Arguments.of(new Integer[]{-1,null,3,4,5,6,7,8,9,10,11,12,13,14,15}, List.of("-1->3->4->6->10","-1->3->4->6->11","-1->3->4->7->12","-1->3->4->7->13","-1->3->5->8->14","-1->3->5->8->15","-1->3->5->9"))
                );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testBinaryTreePaths(Integer[] values, List<String> result){
        TreeNode node = TreeNode.fromArray(values);

        Assertions.assertEquals(result, binaryTreePaths(node));

    }
}
