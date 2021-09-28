package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 2, 0, -2, 4, -7, -23, 12);
        List<Integer> positives = numbers
                .stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());
        System.out.println(positives);
    }
}
