package p290;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p290.P290.wordPattern;

public class P290Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("abba", "dog cat cat dog", true),
                Arguments.of("abba", "dog cat cat fish", false),
                Arguments.of("aaaa", "dog cat cat dog", false),
                Arguments.of("aac", "dog dog", false),
                Arguments.of("a", "dog dog", false),
                Arguments.of("a", "dog", true),
                Arguments.of("aaa", "dog cat dog", false),
                Arguments.of("abc", "dog dog dog", false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testWordPattern(String pattern, String s, boolean result){

        Assertions.assertEquals(result, wordPattern(pattern, s));
    }
}
