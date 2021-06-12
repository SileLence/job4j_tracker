package ru.job4j.oop;

public class Hare {
    public boolean tryEat(Ball ball) {
        System.out.println("Hare says: Ball, I want to eat you!");
        if (ball.sing()) {
            System.out.println("And the Hare could not eat the Ball.");
            return false;
        }
        return true;
    }
}
