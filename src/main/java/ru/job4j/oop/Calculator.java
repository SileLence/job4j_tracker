package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int y = 10;
        Calculator calc = new Calculator();
        System.out.println(sum(y));
        System.out.println(minus(y));
        System.out.println(calc.divide(y));
        System.out.println(calc.sumAllOperation(y));
    }
}
