package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FuncCalcTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalc function = new FunctionCalc();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        FunctionCalc function = new FunctionCalc();
        List<Double> result = function.diapason(2, 5, x -> 2 * (x * x) + 3 * x - 5);
        List<Double> expected = Arrays.asList(9D, 22D, 39D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        FunctionCalc function = new FunctionCalc();
        List<Double> result = function.diapason(-3, 2, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(0.125, 0.25, 0.5, 1.0, 2.0);
        assertThat(result, is(expected));
    }
}
