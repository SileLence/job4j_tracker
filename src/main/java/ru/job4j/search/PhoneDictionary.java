package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> foundInNames = person -> person.getName().contains(key);
        Predicate<Person> foundInSurnames = person -> person.getSurname().contains(key);
        Predicate<Person> foundInPhones = person -> person.getPhone().contains(key);
        Predicate<Person> foundInAddresses = person -> person.getAddress().contains(key);
        Predicate<Person> combine = foundInNames
                .or(foundInSurnames)
                .or(foundInPhones)
                .or(foundInAddresses);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
