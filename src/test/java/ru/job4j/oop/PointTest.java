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

    @Test
    public void when246To531Then5() {
        Point a = new Point(2, 4, 6);
        Point b = new Point(5, 3, 1);
        double expected = 5.916;
        double actual = a.distance3d(b);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void when333To111Then3() {
        Point a = new Point(3, 3, 3);
        Point b = new Point(1, 1, 1);
        double expected = 3.464;
        double actual = a.distance3d(b);
        Assert.assertEquals(expected, actual, 0.001);
    }
}
