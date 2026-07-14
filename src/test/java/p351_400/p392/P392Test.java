package p351_400.p392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.P351_400.p392.P392.isSubsequence;

public class P392Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false),
                Arguments.of("", "", true),
                Arguments.of("a", "", false),
                Arguments.of("", "a", true),
                Arguments.of("aa", "a", false),
                Arguments.of("a", "aa", true)

        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testIsSubsequence(String subsequence, String input, boolean result){

        Assertions.assertEquals(result, isSubsequence(subsequence, input));

    }
}
