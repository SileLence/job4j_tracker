package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int sizeOfResult = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                result[sizeOfResult] = items[i];
                sizeOfResult++;
            }
        }
        if (sizeOfResult != 0) {
            return Arrays.copyOf(result, sizeOfResult);
        }
        return null;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        int sizeOfResult = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                result[sizeOfResult] = items[i];
                sizeOfResult++;
            }
        }
        return Arrays.copyOf(result, sizeOfResult);
    }
}
