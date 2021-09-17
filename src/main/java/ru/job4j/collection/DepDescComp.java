package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        List<String> leftList = Arrays.asList(left.split("/"));
        List<String> rightList = Arrays.asList(right.split("/"));
        String leftElement = leftList.get(0);
        String rightElement = rightList.get(0);
        int result = rightElement.compareTo(leftElement);
        if (result != 0) {
            return result;
        }
        int minStringLength = Math.min(left.length(), right.length());
        for (int j = 0; j < minStringLength; j++) {
            result = Character.compare(left.charAt(j), right.charAt(j));
            if (result != 0) {
                return result;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
