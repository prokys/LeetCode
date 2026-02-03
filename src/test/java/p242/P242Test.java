package p242;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p242.P242.isAnagram;

public class P242Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false),
                Arguments.of("a", "a", true),
                Arguments.of("a", "b", false),
                Arguments.of("aajkdhasda", "adsdfgdfgd", false),
                Arguments.of("adsdfgdfgd", "aajkdhasda", false),
                Arguments.of("aaa", "aab", false),
                Arguments.of("aab", "aaa", false),
                Arguments.of("a", "ab", false),
                Arguments.of("ab", "b", false)

    );}

    @ParameterizedTest
    @MethodSource("data")
    public void testIsAnagram(String s, String t, boolean result){
        Assertions.assertEquals(result, isAnagram(s,t));
    }
}
