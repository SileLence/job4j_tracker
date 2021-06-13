package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load){
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(3);
        Battery battery2 = new Battery(7);
        Battery battery3 = new Battery(0);
        Battery battery4 = new Battery(10);
        Battery battery5 = new Battery(6);
        System.out.println("Battery 1: " + battery1.load);
        System.out.println("Battery 2: " + battery2.load);
        System.out.println("Battery 3: " + battery3.load);
        System.out.println("Battery 4: " + battery4.load);
        System.out.println("Battery 5: " + battery5.load);
        System.out.println();
        battery1.exchange(battery2);
        battery3.exchange(battery4);
        battery5.exchange(battery1);
        System.out.println("Battery 1: " + battery1.load);
        System.out.println("Battery 2: " + battery2.load);
        System.out.println("Battery 3: " + battery3.load);
        System.out.println("Battery 4: " + battery4.load);
        System.out.println("Battery 5: " + battery5.load);
    }
}
