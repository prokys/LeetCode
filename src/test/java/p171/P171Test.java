package p171;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.prokys.p171.P171.titleToNumber;

public class P171Test {

    @ParameterizedTest
    @CsvSource({
            "A, 1",
            "Z, 26",
            "AA, 27",
            "AB, 28",
            "YY, 675",
            "YZ, 676",
            "ZA, 677",
            "ZY, 701",
            "ALK, 999",
            "ALL, 1000",
            "YYY, 17575",
            "YYZ, 17576",
            "FXSHRXW, 2147483647"
    })
    public void testTitleToNumber(String columnTitle, int result){

        Assertions.assertEquals(result, titleToNumber(columnTitle));
    }
}
