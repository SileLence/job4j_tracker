package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key)
            throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return i;
            }
        }
        throw new ElementNotFoundException("Element not found.");
    }

    public static void main(String[] args) {
        String[] values = {"moon", "sea", "cpu", "sound", "wheel"};
        String key = "key";
        try {
            int index = FindEl.indexOf(values, key);
            System.out.println(index);
        } catch (ElementNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
