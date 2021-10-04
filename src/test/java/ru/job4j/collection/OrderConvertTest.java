package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenNoSameObjects() {
        List<Order> orders = new ArrayList<>(List.of(
                new Order("45tr", "Pillow"),
                new Order("220v", "Drill"),
                new Order("R2D2", "SW"),
                new Order("45tr", "Pillow")
        ));
        HashMap<String, Order> map = OrderConvert.process(orders);
        int expectedSize = 3;
        int actualSize = map.size();
        assertEquals(expectedSize, actualSize);
    }
}
