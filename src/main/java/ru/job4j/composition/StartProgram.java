package ru.job4j.composition;

public class StartProgram {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic.someCatAction();
        vetClinic.someDogAction();
    }
}
