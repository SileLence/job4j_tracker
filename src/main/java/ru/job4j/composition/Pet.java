package ru.job4j.composition;

public class Pet {
    private String sound;

    public void sound() {
        System.out.println(this.sound);
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void eat() {                     // Как будто внесли изменение в родительский класс
        System.out.println("Питомец ест");  // У котов метод есть, у собак его нет
    }
}
