package cn.dayangshuo.junit5.tests;

import cn.dayangshuo.junit5.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author DAYANG
 */
public class ParamsTest {

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 102",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        Assertions.assertEquals(expectedResult, Calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
