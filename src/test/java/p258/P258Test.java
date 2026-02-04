package p258;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p258.P258.addDigits;

public class P258Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(38, 2),
                Arguments.of(0, 0),
                Arguments.of(1556456646, 3),
                Arguments.of(11111111, 8),
                Arguments.of(10, 1)
                );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testAddDigits(int values, int result){

        Assertions.assertEquals(result, addDigits(values));

    }
}
