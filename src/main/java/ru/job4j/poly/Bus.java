package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        boolean doorsClosed = true;
        boolean engineStarted = true;
    }

    @Override
    public void carryPassengers(int number) {
        if (number > 0) {
            drive();
        }
    }

    @Override
    public double refuel(double fuelAmount) {
        return 45.90 * fuelAmount;
    }
}
