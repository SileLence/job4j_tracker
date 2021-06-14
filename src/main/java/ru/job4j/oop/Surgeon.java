package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String surgeriesPerformed;

    public Surgeon(String name,
                   String surname,
                   String birthday,
                   String education,
                   String certificates,
                   String surgeriesPerformed) {
        super(name, surname, birthday, education, certificates);
        this.surgeriesPerformed = surgeriesPerformed;
    }

    public String getSurgeriesPerformed() {
        return surgeriesPerformed;
    }

    public void performSurgery() {
    }
}
