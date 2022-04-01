package cn.dayangshuo.junit5;

import cn.dayangshuo.junit5.assertt.AssertTest;
import cn.dayangshuo.junit5.tests.LifeCycleTests;
import org.junit.platform.suite.api.*;

/**
 * @author DAYANG
 */
@SelectClasses({LifeCycleTests.class, AssertTest.class})
//@SelectPackages({"cn.dayangshuo.junit5.tests"})
//@IncludeTags("DEV")
@Suite
@SuiteDisplayName("测试套件，分组测试")
public class SuiteTests {
}
