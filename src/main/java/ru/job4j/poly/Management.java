package ru.job4j.poly;

public class Management {
    public static void main(String[] args) {
        Vehicle boeing = new Airplane();
        Vehicle airbus = new Airplane();
        Vehicle embraer = new Airplane();
        Vehicle eurostar = new Train();
        Vehicle acela = new Train();
        Vehicle thalys = new Train();
        Vehicle scania = new Bus();
        Vehicle liaz = new Bus();
        Vehicle volvo = new Bus();
        Vehicle[] vehicles = {
                boeing, airbus, embraer,
                eurostar, acela, thalys,
                scania, liaz, volvo};

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
