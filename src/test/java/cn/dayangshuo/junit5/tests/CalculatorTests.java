package cn.dayangshuo.junit5.tests;

import cn.dayangshuo.junit5.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.function.Supplier;

/**
 * @author DAYANG
 */
public class CalculatorTests {

    @Test
    @DisplayName("a + b = c")
    void addsTwoNumbers() {
        //测试通过
        Assertions.assertEquals(4, Calculator.add(2, 2));
        //测试失败
        Assertions.assertEquals(3, Calculator.add(2, 2), "Calculator.add(2, 2) 测试失败");
        //测试失败
        Supplier<String> messageSupplier = () -> "Calculator.add(2, 2) 测试失败";
        Assertions.assertEquals(3, Calculator.add(2, 2), messageSupplier);
    }

    @Test
    @DisplayName("a + b = c")
    void test() {
        //测试通过
        Assertions.assertNotEquals(3, Calculator.add(2, 2));
        //测试失败
        Assertions.assertNotEquals(4, Calculator.add(2, 2), "Calculator.add(2, 2) test failed");
        //测试失败
        Supplier<String> messageSupplier = () -> "Calculator.add(2, 2) test failed";
        Assertions.assertNotEquals(4, Calculator.add(2, 2), messageSupplier);
    }

    @Test
    void testCase() {
        Assertions.assertTimeout(Duration.ofMinutes(1), () -> {
            return "result";
        });
        Assertions.assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(200);
            return "result";
        });
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(200);
            return "result";
        });
    }

}
