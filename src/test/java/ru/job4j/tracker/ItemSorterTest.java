package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class ItemSorterTest {

    @Test
    public void whenSortLowToHigh() {
        Item item1 = new Item(1, "item one");
        Item item2 = new Item(2, "item two");
        Item item3 = new Item(3, "item three");
        List<Item> items = new ArrayList<>(asList(
                item3,
                item1,
                item2
        ));
        items.sort(new SortAscending());
        List<Item> expected = new ArrayList<>(asList(
                item1,
                item2,
                item3
        ));
        assertEquals(expected, items);
    }

    @Test
    public void whenSortHighToLow() {
        Item item1 = new Item(1, "item one");
        Item item2 = new Item(2, "item two");
        Item item3 = new Item(3, "item three");
        List<Item> items = new ArrayList<>(asList(
                item3,
                item1,
                item2
        ));
        items.sort(new SortDescending());
        List<Item> expected = new ArrayList<>(asList(
                item3,
                item2,
                item1
        ));
        assertEquals(expected, items);
    }
}
