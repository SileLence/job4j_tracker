package ru.job4j.starbuzz;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaffeinated Coffee");
    }

    @Override
    double cost() {
        return 125.0;
    }
}
