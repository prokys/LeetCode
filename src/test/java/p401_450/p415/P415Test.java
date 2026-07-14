package p401_450.p415;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p401_450.p415.P415.addStrings;

public class P415Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("11", "123", "134"),
                Arguments.of("456", "77", "533"),
                Arguments.of("0", "0", "0"),
                Arguments.of("999", "999", "1998"),
                Arguments.of("9", "1", "10"),
                Arguments.of("99", "1", "100"),
                Arguments.of("10000", "10000", "20000")
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testAddStrings(String first, String second, String result){
        Assertions.assertEquals(result, addStrings(first, second));
    }
}
