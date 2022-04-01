package cn.dayangshuo.junit5;

/**
 * @author DAYANG
 */
public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("add(3, 5) = " + add(a, b));
    }
}
