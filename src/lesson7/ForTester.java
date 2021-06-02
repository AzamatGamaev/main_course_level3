package lesson7;

import lesson7.annotations.AfterSuite;
import lesson7.annotations.BeforeSuite;
import lesson7.annotations.Test;
import lesson7.annotations.TestPriority;

public class ForTester {

    void before() {
        System.out.println("before");
    }

    @AfterSuite
    void after() {
        System.out.println("after");
    }

    @Test(TestPriority.TEN)
    void test10() {
        System.out.println("test 10");
    }

    @Test(TestPriority.ONE)
    void test1() {
        System.out.println("test 1");
    }

    @Test(TestPriority.SIX)
    void test6() {
        System.out.println("test 6");
    }

    @Test
    void testDefaultPriority() {
        System.out.println("test default priority (5)");
    }

    void notTest() {
        System.out.println("not test!");
    }
}
