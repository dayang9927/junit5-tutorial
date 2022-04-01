package cn.dayangshuo.junit5.assum;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/**
 * @author DAYANG
 */
public class AssumptionsTest {

    @Test
    void testOnDev() {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumptionsTest::message);
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")), AssumptionsTest::message);
    }

    @Test
    void testOnProd() {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
    }

    private static String message() {
        return "测试执行失败！";
    }
}
