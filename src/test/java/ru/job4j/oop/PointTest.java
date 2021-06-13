package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when143To735Then43() {
        Point a = new Point(-14, -3);
        Point b = new Point(7, 35);
        double expected = 43.4165;
        double actual = a.distance(b);
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void when42To57Then9() {
        Point a = new Point(4, -2);
        Point b = new Point(5, 7);
        double expected = 9.0553;
        double actual = a.distance(b);
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void when00To00Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0.0;
        double actual = a.distance(b);
        Assert.assertEquals(expected, actual, 0.0001);
    }
}
