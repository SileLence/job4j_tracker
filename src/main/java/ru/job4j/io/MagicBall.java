package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] answers = {"Да", "Нет", "Может быть"};
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0 -> System.out.println(answers[0]);
            case 1 -> System.out.println(answers[1]);
            default -> System.out.println(answers[2]);
        }
    }
}
