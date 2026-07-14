package p401_450.p434;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p401_450.p434.P434.countSegments;

public class P434Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("Hello, my name is John", 5),
                Arguments.of("Hello", 1),
                Arguments.of("Hello   a    Hello", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testCountSegments(String input, int result){
        Assertions.assertEquals(result, countSegments(input));
    }
}
