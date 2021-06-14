package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Галактионов Арсений Матвеевич");
        student.setGroup("211-361");
        student.setEnrollmentDate("2021-08-15");
        System.out.println("Имя: " + student.getFullName()
                + System.lineSeparator()
                + "Учебная группа: " + student.getGroup()
                + System.lineSeparator()
                + "Дата зачисления: " + student.getEnrollmentDate());
    }
}
