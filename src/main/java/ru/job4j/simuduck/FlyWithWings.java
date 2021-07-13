package ru.job4j.simuduck;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This Duck is flying");
    }
}
