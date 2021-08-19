package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftArray = left.split("\\.");
        String[] rightArray = right.split("\\.");
        return Integer.compare(parseInt(leftArray[0]), parseInt(rightArray[0]));
    }
}
