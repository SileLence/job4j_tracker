package ru.job4j.oop;

public class Engineer extends Profession {
    private String specialization;

    public Engineer(String name,
                    String surname,
                    String birthday,
                    String education,
                    String specialization) {
        super(name, surname, birthday, education);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public static void drawScheme() {
    }

    public static void createDevice() {
    }
}
