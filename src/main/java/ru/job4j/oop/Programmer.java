package ru.job4j.oop;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name,
                      String surname,
                      String birthday,
                      String education,
                      String specialization,
                      String language) {
        super(name, surname, birthday, education, specialization);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void writeProgram() {
    }

    public void debugCode() {
    }
}
