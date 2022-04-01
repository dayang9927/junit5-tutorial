package cn.dayangshuo.junit5.tests;

import cn.dayangshuo.junit5.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/**
 * @author DAYANG
 */
public class AssumeTests {

    @Test
    void testOnDev() {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")), AssumeTests::message);
        System.out.println("测试不会继续执行，不会打印此行...");
    }

    /**
     * 测试失败，打印出失败消息
     */
    @Test
    void testOnProd() {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
        System.out.println("测试继续执行...");
    }

    private static String message() {
        return "测试失败...";
    }

    @Test
    void testInAllEnvironments() {
        System.setProperty("ENV", "DEV");
        Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")),
                () -> {
                    //仅在DEV服务器上执行这些断言和打印
                    //即System.setProperty("ENV", "DEV")才会执行
                    Assertions.assertEquals(3, Calculator.add(4, 2));
                });

        // 在所有环境中执行这些断言
        Assertions.assertEquals(13, Calculator.add(6, 7));
    }
}
