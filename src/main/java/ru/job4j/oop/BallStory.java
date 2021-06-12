package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        System.out.println("The Ball runs away from Grandma and Grandpa.");
        System.out.println("The Ball rolls and meets the Hare.");
        hare.tryEat(ball);
        System.out.println("The Ball rolls and meets the Wolf.");
        wolf.tryEat(ball);
        System.out.println("The Ball rolls and meets the Fox.");
        fox.tryEat(ball);
        System.out.println("And the cunning Fox ate the ball");
        System.out.println("The End.");
    }
}
