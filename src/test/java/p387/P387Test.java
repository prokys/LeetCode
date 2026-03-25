package p387;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p387.P387.firstUniqChar;

public class P387Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("leetcode", 0),
                Arguments.of("loveleetcode", 2),
                Arguments.of("aabb", -1)

        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testCanConstruct(String input, int result){

        Assertions.assertEquals(result, firstUniqChar(input));

    }
}
