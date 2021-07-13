package ru.job4j.simuduck;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("This Duck is squeaking");
    }
}
