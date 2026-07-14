package p401_450.P448;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.prokys.p401_450.p448.P448.findDisappearedNumbers;

public class P448Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{4,3,2,7,8,2,3,1}, List.of(5, 6)),
                Arguments.of(new int[]{1,1}, List.of(2))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testFindDisappearedNumbers(int[] input, List<Integer> result){
        Assertions.assertEquals(result, findDisappearedNumbers(input));
    }
}
