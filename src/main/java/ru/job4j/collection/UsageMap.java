package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("email@domain.com", "Shervud Igor Jenkins");
        map.put("email2@domain.com", "Smith Jacob Lawson");
        map.put("email3@domain.com", "Zemskiy Dmitriy Vyacheslavovich");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
