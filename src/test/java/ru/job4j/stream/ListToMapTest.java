package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ListToMapTest {

    @Test
    public void whenConvertListToMapWithSameNames() {
        Student student1 = new Student(60, "surname1");
        Student student2 = new Student(90, "surname2");
        Student student3 = new Student(20, "surname3");
        Student student4 = new Student(80, "surname4");
        Student student5 = new Student(20, "surname3");
        Student student6 = new Student(90, "surname5");
        Student student7 = new Student(60, "surname1");
        Student student8 = new Student(80, "surname6");
        List<Student> students = List.of(
                student1,
                student2,
                student3,
                student4,
                student5,
                student6,
                student7,
                student8
        );
        Map<String, Student> expected = Map.of(
                "surname1", student1,
                "surname2", student2,
                "surname3", student3,
                "surname4", student4,
                "surname5", student6,
                "surname6", student8
        );
        Map<String, Student> actual = new ListToMap().convert(students);
        Assert.assertEquals(expected, actual);
    }
}
