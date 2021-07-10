package ru.job4j.composition;

public class VetClinic {
    private Cat cat = new Cat();
    private Dog dog = new Dog();

    public void someCatAction() {
        cat.setSound("Мяу!");
        cat.sound();
        cat.catchMouse();
        cat.eat();
    }

    public void someDogAction() {
        dog.setSound("Гав!");
        dog.sound();
        dog.catchCat();
    }
}
