package p292;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p292.P292.canWinNim;

public class P292Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(2, true),
                Arguments.of(3, true),
                Arguments.of(4, false),
                Arguments.of(5, true),
                Arguments.of(6, true),
                Arguments.of(7, true),
                Arguments.of(8, false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testCanWinNim(int num, boolean result){

        Assertions.assertEquals(result, canWinNim(num));
    }
}
