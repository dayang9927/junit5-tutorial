package cn.dayangshuo.junit5.tests;

import cn.dayangshuo.junit5.Calculator;
import org.junit.jupiter.api.*;

/**
 * @author DAYANG
 */
public class LifeCycleTests {

//    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll 执行了");
    }

//    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach 执行了");
    }

    @Tag("DEV")
    @DisplayName("生命周期测试")
    @Test
    void testCalcOne() {
        System.out.println("======测试1执行了=======");
        Assertions.assertEquals(4, Calculator.add(2, 2));
    }

    @Tag("PROD")
    @Test
    void testCalcThree() {
        System.out.println("======测试3执行了=======");
        Assertions.assertEquals(6, Calculator.add(2, 4));
    }

    @Tag("DEV")
    @Disabled
    @Test
    void testCalcTwo() {
        System.out.println("======测试2执行了=======");
        Assertions.assertEquals(6, Calculator.add(2, 4));
    }

//    @AfterEach
    void tearThis() {
        System.out.println("@AfterEach 执行了");
    }

//    @AfterAll
    static void tear() {
        System.out.println("@AfterAll 执行了");
    }
}
