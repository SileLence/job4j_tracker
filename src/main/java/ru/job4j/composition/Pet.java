package ru.job4j.composition;

public class Pet {
    private String sound;

    public void sound() {
        System.out.println(this.sound);
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void eat() {
        System.out.println("Питомец ест");
    }
}
