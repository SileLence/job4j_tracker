package ru.job4j.exercises;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        Map<String, Info> map = new HashMap<>();
        for (Info info : list) {
            if (map.containsKey(info.getCity())) {
                Info infoInMap = map.get(info.getCity());
                int newRainfall = infoInMap.getRainfall() + info.getRainfall();
                map.computeIfPresent(
                        info.getCity(), (key, value)
                                -> new Info(info.getCity(), newRainfall)
                );
            }
            map.putIfAbsent(info.getCity(), info);
        }
        List<Info> result = new ArrayList<>();
        result.add(map.get("Gomel"));
        result.add(map.get("Vitebsk"));
        result.add(map.get("Brest"));
        result.add(map.get("Grodna"));
        result.add(map.get("Minsk"));
        return result;
    }

    public static class Info {
        private String city;
        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
