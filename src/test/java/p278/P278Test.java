package p278;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p278.P278.firstBadVersion;

public class P278Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(5, 4),
                Arguments.of(5, 1),
                Arguments.of(6, 3),
                Arguments.of(6, 4),
                Arguments.of(6, 1),
                Arguments.of(7, 3),
                Arguments.of(7, 4),
                Arguments.of(6, 6),
                Arguments.of(7, 5),
                Arguments.of(7, 7),
                Arguments.of(16, 7),
                Arguments.of(16, 9),
                Arguments.of(1024, 1023),
                Arguments.of(1024, 511),
                Arguments.of(1024, 2),
                Arguments.of(1024, 870),
                Arguments.of(2147483647, 2),
                Arguments.of(2147483647, 54644664),
                Arguments.of(2147483647, 2147483646),
                Arguments.of(2, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testFirstBadVersion(int values, int result){

        Assertions.assertEquals(result, firstBadVersion(values, result));

    }
}
