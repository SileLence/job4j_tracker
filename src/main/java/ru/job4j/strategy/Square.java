package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        String newline = System.lineSeparator();
        return    "|‾‾‾‾‾‾‾|" + newline
                + "|       |" + newline
                + "|_______|" + newline;
    }
}
