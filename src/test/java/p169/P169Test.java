package p169;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p169.P169.majorityElement;

public class P169Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{3,1,3}, 3),
                Arguments.of(new int[]{2,2,1,1,1,2,2}, 2),
                Arguments.of(new int[]{3}, 3),
                Arguments.of(new int[]{-3,-1,-3}, -3),
                Arguments.of(new int[]{-2,-2,-1,-1,-1,-2,-2}, -2),
                Arguments.of(new int[]{-3}, -3)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testMajorityElement(int[]values, int result){
        Assertions.assertEquals(majorityElement(values), result);
    }
}
