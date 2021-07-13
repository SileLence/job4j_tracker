package ru.job4j.starbuzz;

public abstract class Beverage {
    private String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    abstract double cost();
}
