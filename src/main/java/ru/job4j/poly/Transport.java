package ru.job4j.poly;

public interface Transport {
    void drive();

    void carryPassengers(int number);

    double refuel(double fuelAmount);
}
