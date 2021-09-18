//комментарий, чтобы внести изменения в файл и сделать коммит

package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftArray = left.split("/");
        String[] rightArray  = right.split("/");
        int result = rightArray[0].compareTo(leftArray[0]);
        if (result == 0) {
            return left.compareTo(right);
        }
        return result;
    }
}

//комментарий, чтобы внести изменения в файл и сделать коммит
