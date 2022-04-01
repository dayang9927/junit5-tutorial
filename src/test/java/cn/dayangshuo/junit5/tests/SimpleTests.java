package cn.dayangshuo.junit5.tests;

import cn.dayangshuo.junit5.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author DAYANG
 */
public class SimpleTests {

    @Test
    void addsTwoNumbers() {
        Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }
}
