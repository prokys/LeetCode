package p451_500.p455;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p451_500.p455.P455.findContentChildren;

public class P455Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3}, new int[]{1,1}, 1),
                Arguments.of(new int[]{1,2}, new int[]{1,2,3}, 2),
                Arguments.of(new int[]{1,1,1,1,1,1}, new int[]{1}, 1),
                Arguments.of(new int[]{1}, new int[]{1,1,1,1,1,1}, 1),
                Arguments.of(new int[]{1,2,3,1,2,3}, new int[]{1,2,3,1,2,3}, 6),
                Arguments.of(new int[]{}, new int[]{1,2,3,1,2,3}, 0),
                Arguments.of(new int[]{1}, new int[]{}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testFindContentChildren(int[] g, int[] s, int result){
        Assertions.assertEquals(result, findContentChildren(g,s));
    }
}
