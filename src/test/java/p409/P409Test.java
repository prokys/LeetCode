package p409;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p409.P409.longestPalindrome;

public class P409Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("abccccdd", 7),
                Arguments.of("a", 1),
                Arguments.of("aaa", 3),
                Arguments.of("aaaaa", 5),
                Arguments.of("ab", 1),
                Arguments.of("aabb", 4),
                Arguments.of("abb", 3),
                Arguments.of("aab", 3),
                Arguments.of("aaabbb", 5),
                Arguments.of("aaabbbbb", 7),
                Arguments.of("aaabbbccc", 7),
                Arguments.of("abcd", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testLongestPalindrome(String input, int result){
        Assertions.assertEquals(result, longestPalindrome(input));
    }
}
