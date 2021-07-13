package ru.job4j.simuduck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new DecoyDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyRocketPowered());
        System.out.println("Made some changes and now...");
        duck.performFly();
    }
}
