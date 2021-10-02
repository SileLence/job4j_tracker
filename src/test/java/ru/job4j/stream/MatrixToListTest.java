package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void whenConvertMatrixToList() {
        Integer[][] integers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expected = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
        List<Integer> actual = new MatrixToList().convert(integers);
        Assert.assertEquals(expected, actual);
    }
}
