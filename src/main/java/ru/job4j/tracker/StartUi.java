package ru.job4j.tracker;

import java.util.Scanner;

public class StartUi {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int choice;
            do {
                System.out.print("Please enter number from 0 to 6: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Please enter number from 0 to 6: ");
                    scanner.next();
                }
                choice = scanner.nextInt();
            } while (choice < 0 || choice > 6);
            switch (choice) {
                case 0 -> {
                    System.out.print("Please enter the name of the item to add: ");
                    String name = scanner.next();
                    Item newItem = new Item(name);
                    tracker.add(newItem);
                    System.out.println("Success: The new item was added.");
                    System.out.println();
                }
                case 1 -> {
                    Item[] items = tracker.findAll();
                    if (items.length > 0) {
                        System.out.println("The current items list:");
                        for (Item item : items) {
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("No items");
                    }
                    System.out.println();
                }
                case 2 -> {
                    System.out.print("Please enter ID of exist item to edit: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Please enter correct ID of exist item: ");
                        scanner.next();
                    }
                    int id = scanner.nextInt();
                    System.out.print("Please enter name of new item to replace existed: ");
                    String name = scanner.next();
                    Item newItem = new Item(name);
                    if (tracker.replace(id, newItem)) {
                        System.out.println("Success: The item has been edited.");
                    } else {
                        System.out.println("Error: Can't find entered ID: "
                                + id + ". Please try again.");
                    }
                    System.out.println();
                }
                case 3 -> {
                    System.out.print("Please enter ID of exist item to deletion: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Please enter correct ID of exist item: ");
                        scanner.next();
                    }
                    int id = scanner.nextInt();
                    if (tracker.delete(id)) {
                        System.out.println("Success: The item has been deleted.");
                    } else {
                        System.out.println("Error: Can't find entered ID: "
                                + id + ". Please try again.");
                    }
                    System.out.println();
                }
                case 4 -> {
                    System.out.print("Please enter the item ID to search: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Please enter correct ID of exist item: ");
                        scanner.next();
                    }
                    int id = scanner.nextInt();
                    tracker.findById(id);
                    Item item = tracker.findById(id);
                    if (item != null) {
                        System.out.println("The item is found: " + item);
                    } else {
                        System.out.println("Error: No item with ID " + id);
                    }
                }
                case 5 -> {
                    System.out.print("Please enter the name of the element to search: ");
                    String name = scanner.next();
                    Item[] foundItems = tracker.findByName(name);
                    if (foundItems.length > 0) {
                        System.out.println("Found items:");
                        for (Item item : foundItems) {
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("Error: No items with name "
                                + "\"" + name + "\"");
                    }
                }
                case 6 -> run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu."
                + "\n" + "0. Add new item"
                + "\n" + "1. Show all items"
                + "\n" + "2. Edit item"
                + "\n" + "3. Delete item"
                + "\n" + "4. Find item by ID"
                + "\n" + "5. Find items by name"
                + "\n" + "6. Exit program");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUi().init(scanner, tracker);
    }
}
