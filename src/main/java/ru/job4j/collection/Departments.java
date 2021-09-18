//комментарий, чтобы внести изменения в файл и сделать коммит

package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> temp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = "".equals(start) ? el : start + "/" + el;
                temp.add(start);
            }
        }
        return new ArrayList<>(temp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.nullsLast(Comparator.naturalOrder()));
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(Comparator.nullsLast(new DepDescComp()));
    }
}

//комментарий, чтобы внести изменения в файл и сделать коммит
