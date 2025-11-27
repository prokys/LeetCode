package p205;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.prokys.p205.P205.isIsomorphic;

public class P205Test {

    @ParameterizedTest
    @CsvSource({
            "egg, add, true",
            "foo, bar, false",
            "bar, foo, false",
            "paper, title, true",
            "!!!, add, false",
            "EGG, aDd, false",
            "EgG, aDd, true"

    })
    public void testIsIsomorphic(String first, String second, Boolean result){
        Assertions.assertEquals(isIsomorphic(first, second), result);
    }
}
