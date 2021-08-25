package ru.job4j.exercises;

import java.util.*;

public class Pangram {
    public static boolean checkString(String s) {
        List<String> letters = Arrays.asList(s.split("[^a-zA-Z]"));
        Set<String> letterSet = new HashSet<>(letters);
        return letterSet.size() == 26;
    }
}
