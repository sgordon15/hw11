package edu.ti.caih313.collections.lambda;

public class Calculator {
    public static void main(String... args) {

        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));
    }

    private int operateBinary(int a, int b, IntegerMath integerMath) {
        return integerMath.operation(a, b);
    }
}
