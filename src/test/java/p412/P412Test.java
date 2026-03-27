package p412;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.prokys.p412.P412.fizzBuzz;

public class P412Test {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(3, List.of("1","2","Fizz")),
                Arguments.of(5, List.of("1","2","Fizz","4","Buzz")),
                Arguments.of(15, List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testFizzBuzz(int input, List<String> result){
        Assertions.assertEquals(result, fizzBuzz(input));
    }
}
