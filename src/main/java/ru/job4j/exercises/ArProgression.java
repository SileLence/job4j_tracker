package ru.job4j.exercises;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int result = data.get(0);
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                return 0;
            }
            result += data.get(i);
        }
        return result + data.get(data.size() - 1);
    }
}
