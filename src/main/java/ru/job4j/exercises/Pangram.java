package ru.job4j.exercises;

import java.util.*;

public class Pangram {
    public static boolean checkString(String s) {
        String[] letters = s.split("");
        Set<String> letterSet = new HashSet<>();
        for (String letter : letters) {
            if (!" ".equals(letter)) {
                letterSet.add(letter);
            }
        }
        return letterSet.size() == 26;
    }
}
