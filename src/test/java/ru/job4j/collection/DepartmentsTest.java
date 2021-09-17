package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenOneMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSeveralMissed() {
        List<String> input = Arrays.asList("k1", "k1/sk1/ssk1/sssk1");
        List<String> expect = Arrays.asList(
                "k1",
                "k1/sk1",
                "k1/sk1/ssk1",
                "k1/sk1/ssk1/sssk1"
        );
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAsc() {
        List<String> input = Arrays.asList(
                "k1/sk1/ssk1",
                "k1",
                "k1/sk1/ssk1/sssk1",
                "k1/sk1"
        );
        List<String> expected = Arrays.asList(
                "k1",
                "k1/sk1",
                "k1/sk1/ssk1",
                "k1/sk1/ssk1/sssk1"
        );
        Departments.sortAsc(input);
        assertThat(input, is(expected));
    }

    @Test
    public void whenSortDesc() {
        List<String> input = Arrays.asList(
                "k2",
                "k1/sk1/ssk1",
                "k1",
                "k2/sk1/ssk2/sssk1",
                "k2/sk1",
                "k1/sk1"
        );
        List<String> expected = Arrays.asList(
                "k2",
                "k2/sk1",
                "k2/sk1/ssk2/sssk1",
                "k1",
                "k1/sk1",
                "k1/sk1/ssk1"
        );
        Departments.sortDesc(input);
        assertThat(input, is(expected));
    }

    @Test
    public void whenSortWithNullAndEmpty() {
        List<String> input = Arrays.asList(
                "k2",
                "k1/sk1/ssk1",
                "",
                "k2/sk1/ssk1/sssk1",
                null,
                "k1/sk1"
        );
        List<String> expectedAsc = Arrays.asList(
                "",
                "k1/sk1",
                "k1/sk1/ssk1",
                "k2",
                "k2/sk1/ssk1/sssk1",
                null
        );
        List<String> expectedDesc = Arrays.asList(
                "k2",
                "k2/sk1/ssk1/sssk1",
                "k1/sk1",
                "k1/sk1/ssk1",
                "",
                null
        );
        Departments.sortAsc(input);
        assertThat(input, is(expectedAsc));
        Departments.sortDesc(input);
        assertThat(input, is(expectedDesc));
    }
}
