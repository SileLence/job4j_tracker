package ru.job4j.oop;

public class Doctor extends Profession {
    private String certificates;

    public Doctor(String name,
                  String surname,
                  String birthday,
                  String education,
                  String certificates) {
        super(name, surname, birthday, education);
        this.certificates = certificates;
    }

    public String getCertificates() {
        return certificates;
    }

    public void toDiagnose() {
    }

    public void prescribeTreatment() {
    }
}
