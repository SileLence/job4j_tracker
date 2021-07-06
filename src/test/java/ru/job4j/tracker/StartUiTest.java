package ru.job4j.tracker;

import org.junit.Test;
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
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction(output)
        };
        new StartUi(output).init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
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
        UserAction[] actions = {
                new ReplaceAction(output),
                new ExitAction(output)
        };
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
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction(output)
        };
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
        UserAction[] actions = {
                new ShowAllAction(output),
                new ExitAction(output)
        };
        new StartUi(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Show all Items" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Show all Items ===" + System.lineSeparator()
                        + "Item --> " + "ID: " + item.getId()
                        + ", Name: '" + item.getName() + '\''
                        + ", Created: " + item.getCreated()
                        + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Show all Items" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        String id = item.getId() + "";
        Input input = new StubInput(
                new String[] {"0", id, "1"}
        );
        Output output = new StubOutput();
        UserAction[] actions = {
                new FindByIdAction(output),
                new ExitAction(output)
        };
        new StartUi(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Item by ID" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find Item by ID ===" + System.lineSeparator()
                        + "Item --> " + "ID: " + item.getId()
                        + ", Name: '" + item.getName() + '\''
                        + ", Created: " + item.getCreated()
                        + System.lineSeparator()
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
        UserAction[] actions = {
                new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUi(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Items by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find Items by name ===" + System.lineSeparator()
                        + "Item --> " + "ID: " + item.getId()
                        + ", Name: '" + item.getName() + '\''
                        + ", Created: " + item.getCreated()
                        + System.lineSeparator()
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
        UserAction[] actions = {
                new ExitAction(output)
        };
        new StartUi(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
        ));
    }
}
