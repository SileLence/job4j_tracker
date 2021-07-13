package ru.job4j.starbuzz;

public class Espresso extends Beverage {
    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    double cost() {
        return 100.0;
    }
}
