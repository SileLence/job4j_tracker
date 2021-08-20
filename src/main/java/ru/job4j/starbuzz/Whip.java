package ru.job4j.starbuzz;

public class Whip extends Beverage {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    double cost() {
        return 25.0 + beverage.cost();
    }
}
