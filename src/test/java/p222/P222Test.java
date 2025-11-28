package p222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.prokys.utils.TreeNode;

import java.util.stream.Stream;

import static org.prokys.p222.P222.countNodes;

public class P222Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new Integer[]{1,2,3,4,5,6}, 6),
                Arguments.of(new Integer[]{}, 0),
                Arguments.of(new Integer[]{1}, 1),
                Arguments.of(new Integer[]{1,2,3}, 3),
                Arguments.of(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testCountNodes(Integer[] values, int result){
        TreeNode node = TreeNode.fromArray(values);

        Assertions.assertEquals(result, countNodes(node));

    }
}
