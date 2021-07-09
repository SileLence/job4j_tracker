package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int expected = input.askInt("Enter menu:");
        assertThat(expected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenMultipleValidInput() {
        Output out = new StubOutput();
        String[] answers = {"3", "5", "7", "1"};
        Input in = new StubInput(answers);
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(Integer.parseInt("3")));
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(Integer.parseInt("5")));
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(Integer.parseInt("7")));
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(Integer.parseInt("1")));
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int expected = input.askInt("Enter menu:");
        assertThat(expected, is(-1));
    }
}
