package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class DummyDicTest {

    @Test
    public void whenSoundThenUnknown() {
        DummyDic translator = new DummyDic();
        String word = "Sound";
        String expected = "Неизвестное слово: Sound";
        String actual = translator.engToRus(word);
        Assert.assertEquals(expected, actual);
    }
}
