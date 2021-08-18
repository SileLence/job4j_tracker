package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenAscByName() {
        Comparator<Job> jobComparator = new JobAscByName();
        int result = jobComparator.compare(
                new Job("Active", 2),
                new Job("Direct", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenDescByName() {
        Comparator<Job> jobComparator = new JobDescByName();
        int result = jobComparator.compare(
                new Job("Active", 2),
                new Job("Direct", 1)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenAscByPriority() {
        Comparator<Job> jobComparator = new JobAscByPriority();
        int result = jobComparator.compare(
                new Job("Active", 2),
                new Job("Direct", 1)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenDescByPriority() {
        Comparator<Job> jobComparator = new JobDescByPriority();
        int result = jobComparator.compare(
                new Job("Active", 2),
                new Job("Direct", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenAscByNameAndPriority() {
        Comparator<Job> jobComparator =
                new JobAscByName().thenComparing(new JobAscByPriority());
        int differentNames = jobComparator.compare(
                new Job("Active", 2),
                new Job("Direct", 1)
        );
        assertThat(differentNames, lessThan(0));
        int sameNames = jobComparator.compare(
                new Job("Active", 2),
                new Job("Active", 1)
        );
        assertThat(sameNames, greaterThan(0));
    }

    @Test
    public void whenDescByNameAndPriority() {
        Comparator<Job> jobComparator =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int differentNames = jobComparator.compare(
                new Job("Active", 2),
                new Job("Direct", 1)
        );
        assertThat(differentNames, greaterThan(0));
        int sameNames = jobComparator.compare(
                new Job("Active", 2),
                new Job("Active", 1)
        );
        assertThat(sameNames, lessThan(0));
    }
}
