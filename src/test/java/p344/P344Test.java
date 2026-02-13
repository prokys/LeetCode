package p344;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p344.P344.reverseString;

public class P344Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new char[] {'h','e','l','l','o'}, new char[] {'o','l','l','e','h'}),
                Arguments.of(new char[] {'H','a','n','n','a','h'}, new char[] {'h','a','n','n','a', 'H'})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testReverseString(char[] s, char[] result){

        reverseString(s);

        Assertions.assertArrayEquals(result, s);
    }
}
