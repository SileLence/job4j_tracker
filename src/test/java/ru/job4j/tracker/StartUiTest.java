package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUiTest {

    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input input = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>(asList(
                new CreateAction(output),
                new ExitAction(output)
        ));
        new StartUi(output).init(input, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        String id = String.valueOf(item.getId());
        Input input = new StubInput(
                new String[] {"0", id, "Replaced", "1"}
        );
        Output output = new StubOutput();
        ArrayList<UserAction> actions = new ArrayList<>(asList(
                new ReplaceAction(output),
                new ExitAction(output)
        ));
        new StartUi(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is("Replaced"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        String id = String.valueOf(item.getId());
        Input input = new StubInput(
                new String[] {"0", id, "1"}
        );
        Output output = new StubOutput();
        ArrayList<UserAction> actions = new ArrayList<>(asList(
                new DeleteAction(output),
                new ExitAction(output)
        ));
        new StartUi(output).init(input, tracker, actions);
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void whenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        Input input = new StubInput(
                new String[] {"0", "1"}
        );
        Output output = new StubOutput();
        ArrayList<UserAction> actions = new ArrayList<>(asList(
                new ShowAllAction(output),
                new ExitAction(output)
        ));
        new StartUi(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Show all Items" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Show all Items ===" + System.lineSeparator()
                        + item + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Show all Items" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        String id = String.valueOf(item.getId());
        Input input = new StubInput(
                new String[] {"0", id, "1"}
        );
        Output output = new StubOutput();
        ArrayList<UserAction> actions = new ArrayList<>(asList(
                new FindByIdAction(output),
                new ExitAction(output)
        ));
        new StartUi(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Item by ID" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find Item by ID ===" + System.lineSeparator()
                        + item + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Item by ID" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        String name = item.getName();
        Input input = new StubInput(
                new String[] {"0", name, "1"}
        );
        Output output = new StubOutput();
        ArrayList<UserAction> actions = new ArrayList<>(asList(
                new FindByNameAction(output),
                new ExitAction(output)
        ));
        new StartUi(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Items by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find Items by name ===" + System.lineSeparator()
                        + item + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Items by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenExit() {
        Output output = new StubOutput();
        Input input = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>(List.of(
                new ExitAction(output)
        ));
        new StartUi(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"7", "0"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>(List.of(
                new ExitAction(out)
        ));
        new StartUi(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit" + ln
                )
        );
    }
}
