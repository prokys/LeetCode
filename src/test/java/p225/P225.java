package p225;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.prokys.p225.P225.*;

public class P225 {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new String[]{"MyStack","push","push","top","pop","empty"}, new Integer[]{null, 1, 2, null, null, null}, new String[]{null, null, null, "2", "2", "false"}),
                Arguments.of(new String[]{"MyStack","push","push","top","pop","push","push","empty"}, new Integer[]{null,1,2,null,null,1,2,null}, new String[]{null,null,null,"2","2",null,null,"false"}),
                Arguments.of(new String[]{"MyStack","push","push","top","pop","push","push","top","pop","empty"}, new Integer[]{null, 1, 2, null, null, 1, 2, null, null, null}, new String[]{null,null,null,"2","2",null,null,"2","2","false"}),
                Arguments.of(new String[]{"MyStack","push","top","pop","empty"}, new Integer[]{null, 1, null, null, null}, new String[]{ null, null, "1", "1", "true"}),
                Arguments.of(new String[]{"MyStack","empty"}, new Integer[]{null, null}, new String[]{null, "true"})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testMyStack(String[] input, Integer[] parameters, String[] result){

        MyStack myStack = new MyStack();

        for (int i = 0; i < input.length; i++) {
            switch (input[i]){
                case "MyStack":{
                    myStack = new MyStack();
                    break;
                }
                case "push":{
                    myStack.push(parameters[i]);
                    break;
                }
                case "top":{
                    Assertions.assertEquals(Integer.parseInt(result[i]), myStack.top());
                    break;
                }
                case "pop":{
                    Assertions.assertEquals(Integer.parseInt(result[i]), myStack.pop());
                    break;
                }
                case "empty":{
                    Assertions.assertEquals(result[i].equals("true"), myStack.empty());
                    break;
                }
            }
        }

    }
}
