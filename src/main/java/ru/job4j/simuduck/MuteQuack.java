package ru.job4j.simuduck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("This Duck can't quack");
    }
}
