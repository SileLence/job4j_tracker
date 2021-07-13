package ru.job4j.simuduck;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("This Duck is quacking");
    }
}
