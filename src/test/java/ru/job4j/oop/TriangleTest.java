package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(-1, 2);
        Point c = new Point(1, -2);
        Triangle triangle = new Triangle(a, b, c);
        double expected = -1;
        double actual = triangle.area();
        Assert.assertEquals(expected, actual, 0.001);
    }
}
