package p345;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p345.P345.reverseVowels;


public class P345Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("IceCreAm", "AceCreIm"),
                Arguments.of("leetcode", "leotcede")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testReverseVowels(String s, String result){

        Assertions.assertEquals(result, reverseVowels(s));
    }
}
