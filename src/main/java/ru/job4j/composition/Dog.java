package ru.job4j.composition;

public class Dog {
    private Pet pet = new Pet();

    public void sound() {
        pet.sound();
    }

    public void setSound(String sound) {
        pet.setSound(sound);
    }

    public void catchCat() {
        System.out.println("Ловлю кошку");
    }
}
