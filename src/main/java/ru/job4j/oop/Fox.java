package ru.job4j.oop;

public class Fox {
    public boolean tryEat(Ball ball) {
        System.out.println("Fox says: Ball, I want to eat you!");
        if (ball.sing()) {
            System.out.println("Fox says: Dear Ball, I can't hear well, " +
                    "sit on my nose and sing the song again, please...");
            System.out.println("The Ball jumped on the Fox's nose and sang a song again.");
            return trick(ball);
        }
        return false;
    }

    public boolean trick(Ball ball) {
        return !ball.sing();
        }
}
