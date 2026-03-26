package P389;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p389.P389.findTheDifference;

public class P389Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("abcd", "abcde", 'e'),
                Arguments.of("", "y", 'y'),
                Arguments.of("abcd", "edcba", 'e'),
                Arguments.of("a", "aa", 'a')
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testFindTheDifference(String input, String shuffle, int result){

        Assertions.assertEquals(result, findTheDifference(input, shuffle));

    }
}
