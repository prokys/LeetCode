package p217;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p217.P217.containsDuplicate;

public class P217Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,1}, true),
                Arguments.of(new int[]{1,2,3,4}, false),
                Arguments.of(new int[]{1,1,1,3,3,4,3,2,4,2}, true),
                Arguments.of(new int[]{1}, false),
                Arguments.of(new int[]{1,1}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testContainsDuplicate(int[] values, boolean result){
        Assertions.assertEquals(result, containsDuplicate(values));
    }
}
