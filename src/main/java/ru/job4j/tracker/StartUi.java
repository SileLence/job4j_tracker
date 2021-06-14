package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUi {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime dateTime = item.getCreated();
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(dateTime.format(formatter));
    }
}
