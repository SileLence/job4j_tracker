package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUiTest {

    /*@Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction(output)
        };
        new StartUi().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Input input = new StubInput(
                new String[] {"0", "New", "1", "1", "Replaced", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ReplaceAction(output),
                new ExitAction(output)
        };
        new StartUi().init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Replaced"));
    }

    @Test
    public void whenDeleteItem() {
        Input input = new StubInput(
                new String[] {"0", "New", "1", "1", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new DeleteAction(output),
                new ExitAction(output)
        };
        new StartUi().init(input, tracker, actions);
        assertNull(tracker.findById(1));
    }*/
}
