package ru.job4j.starbuzz;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast Coffee");
    }

    @Override
    double cost() {
        return 75.0;
    }
}
