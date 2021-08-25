package ru.job4j.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        List<String> letters = Arrays.asList(s.split(""));
        letters.sort(new StringComparator());
        StringBuilder builder = new StringBuilder();
        for (String letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
