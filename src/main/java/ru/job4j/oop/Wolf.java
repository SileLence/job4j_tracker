package ru.job4j.oop;

public class Wolf {
    public boolean tryEat(Ball ball) {
        System.out.println("Wolf says: Ball, I want to eat you!");
        if (ball.sing()) {
            System.out.println("And the Wolf could not eat the Ball too.");
            return false;
        }
        return true;
    }
}
