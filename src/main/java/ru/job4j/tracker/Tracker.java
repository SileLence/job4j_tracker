package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                return index;
            }
        }
        return -1;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }
}
