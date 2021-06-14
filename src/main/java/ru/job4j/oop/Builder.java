package ru.job4j.oop;

public class Builder extends Engineer {
    private String materialsUsed;

    public Builder(String name,
                   String surname,
                   String birthday,
                   String education,
                   String specialization,
                   String materialsUsed) {
        super(name, surname, birthday, education, specialization);
        this.materialsUsed = materialsUsed;
    }

    public String getMaterialsUsed() {
        return materialsUsed;
    }

    public void viewBuildingPlan() {
    }

    public void toBuild() {
    }
}
