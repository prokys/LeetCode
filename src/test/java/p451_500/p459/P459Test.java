package p451_500.p459;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p451_500.p459.P459.repeatedSubstringPattern;

public class P459Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("abab", true),
                Arguments.of("aba", false),
                Arguments.of("abcabcabcabc", true),
                Arguments.of("aa", true),
                Arguments.of("a", false),
                Arguments.of("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc", true),
                Arguments.of("adlahnfvfhaifasfavzfafdasfafgaldnooifafoiefadlahnfvfhaifasfavzfafdasfafgaldnooifafoiefadlahnfvfhaifasfavzfafdasfafgaldnooifafoiefagjghdlahnfvfhaifasfagfhghvzfafdasfafgaldnooifafoiefadlahnfvfhaifasfavzfafdasfafgaldnooifafoiefadlahnfasdvfhaifasfavzfafdasfafgaldnooifafoief", false),
                Arguments.of("aaa", true),
                Arguments.of("aaaa", true),
                Arguments.of("aaaaa", true),
                Arguments.of("aaaaaa", true),
                Arguments.of("aaaaaaa", true)

        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testRepeatedSubstringPattern(String input, boolean result){
        Assertions.assertEquals(result, repeatedSubstringPattern(input));
    }
}
