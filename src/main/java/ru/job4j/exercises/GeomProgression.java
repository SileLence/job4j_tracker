package ru.job4j.exercises;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> progression = new ArrayList<>(count);
        progression.add(first);
        int sumOfElements = first;
        for (int i = 1; i < count; i++) {
            int element = first * (int) Math.pow(denominator, i);
            progression.add(element);
            sumOfElements += element;
        }
        return sumOfElements;
    }
}
