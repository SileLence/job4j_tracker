package ru.job4j.lambda;

import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String str1 = "left";
        String str2 = "right";
        Comparator<String> stringComparator = (left, right) -> {
            System.out.println("Compare strings by length descending — " + left.length()
                    + " : " + right.length());
            System.out.print("Result: ");
            return Integer.compare(right.length(), left.length());
        };
        System.out.println(stringComparator.compare(str1, str2));
    }
}
