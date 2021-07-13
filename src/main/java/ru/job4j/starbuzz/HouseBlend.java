package ru.job4j.starbuzz;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("House Blend Coffee");
    }

    @Override
    double cost() {
        return 50.0;
    }
}
