package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        char[] list1 = left.toCharArray();
        char[] list2 = right.toCharArray();
        int maxIndex = Math.max(list1.length, list2.length);
        int result = 0;
        for (int index = 0; index < maxIndex; index++) {
            if (index < list1.length && index < list2.length) {
                result = Character.compare(list1[index], list2[index]);
            }
            if (result != 0) {
                return result;
            }
        }
        return list1.length - list2.length;
    }
}
