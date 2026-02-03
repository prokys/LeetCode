package p232;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p232.P232.runCommands;

public class P232Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new String[]{"MyQueue", "push", "push", "peek", "pop", "empty"}, new Integer[]{null, 1, 2, null, null, null}, new String[]{null, null, null, "1", "1", "false"}),
                Arguments.of(new String[]{"MyQueue","push","push","push","pop","pop","pop"}, new Integer[]{null, 1, 2, 3, null, null, null}, new String[]{null, null, null, null, "1", "2", "3"}),
                Arguments.of(new String[]{"MyQueue","push","push","push","push","push"}, new Integer[]{null, 1, 2, 3, 4, 5}, new String[]{null, null, null, null, null, null}),
                Arguments.of(new String[]{"MyQueue","push","push","push","peek","pop","peek"}, new Integer[]{null, 1, 2, 3, null, null, null}, new String[]{null, null, null, null, "1", "1", "2"}),
                Arguments.of(new String[]{"MyQueue","empty"}, new Integer[]{null, null}, new String[]{null, "true"})
                );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testMyQue(String[] input, Integer[] parameters, String[] result){

        Assertions.assertArrayEquals(result, runCommands(input,parameters));

    }

}
