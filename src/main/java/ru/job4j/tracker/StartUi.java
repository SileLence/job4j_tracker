package ru.job4j.tracker;

public class StartUi {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("ItemName");
        System.out.println(item);
    }
}
