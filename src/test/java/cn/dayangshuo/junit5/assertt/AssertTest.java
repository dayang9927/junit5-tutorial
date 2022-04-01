package cn.dayangshuo.junit5.assertt;

import cn.dayangshuo.junit5.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

/**
 * @author DAYANG
 */
public class AssertTest {

    @Test
    @Tag("DEV")
    void assertTest() {
        //测试通过
        Assertions.assertNotEquals(3, Calculator.add(2, 2));
        //测试失败
        Assertions.assertNotEquals(4, Calculator.add(2, 2), "Calculator.add(2, 2) test failed");
        //测试失败
        Supplier<String> messageSupplier  = () -> "Calculator.add(2, 2) test failed";
        Assertions.assertNotEquals(4, Calculator.add(2, 2), messageSupplier);
    }
}
