package ru.job4j.simuduck;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This Duck is flying by rocket power!");
    }
}
