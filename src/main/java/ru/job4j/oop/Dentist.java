package ru.job4j.oop;

public class Dentist extends Doctor {
    private String experience;

    public Dentist(String name,
                   String surname,
                   String birthday,
                   String education,
                   String certificates,
                   String experience) {
        super(name, surname, birthday, education, certificates);
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    public void cariesTreatment() {
    }

    public void toothRemoval() {
    }
}
