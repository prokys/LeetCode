package p228;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.prokys.p228.P228.summaryRanges;

public class P228Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{0,1,2,4,5,7}, List.of("0->2","4->5","7")),
                Arguments.of(new int[]{0,2,3,4,6,8,9}, List.of("0","2->4","6","8->9")),
                Arguments.of(new int[]{0}, List.of("0")),
                Arguments.of(new int[]{0,1,2,3}, List.of("0->3")),
                Arguments.of(new int[]{0,2,4}, List.of("0","2","4")),
                Arguments.of(new int[]{}, List.of()),
                Arguments.of(new int[]{-2147483648,0,2,3,4,6,8,9}, List.of("-2147483648","0","2->4","6","8->9"))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testSummaryRanges(int[] input, List<String>result){
        Assertions.assertEquals(result, summaryRanges(input));
    }
}
