package p383;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p383.P383.canConstruct;

public class P383Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("aa", "ab", false),
                Arguments.of("aa", "aab", true),
                Arguments.of("aabb", "aab", false),
                Arguments.of("aabb", "aabb", true),
                Arguments.of("aabb", "aaabbb", true)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testCanConstruct(String ransomNote, String magazine, boolean result){

        Assertions.assertEquals(result, canConstruct(ransomNote,magazine));

    }
}
