package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        String newline = System.lineSeparator();
        return    "   ^   " + newline
                + " /   \\" + newline
                + "/_____\\" + newline;
    }
}
