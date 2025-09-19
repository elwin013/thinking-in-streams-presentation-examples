package pl.net.banach;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Gatherer;

public class Ex7_Classic_DistinctBy {
    private static final List<String> words = Arrays.asList(
            "Level", "Radar", "Noon", "Apple" , "Civic",
            "Banana", "Deified", "Refer", "Rotor", "Kayak",
            "Window", "Madam", "Orange", "Table", "Racecar"
    );

    private record DistinctString(String string) {
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) {return false;}
            DistinctString that = (DistinctString) o;
            return Objects.equals(string.length(), that.string.length());
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(string.length());
        }
    }

    public static void main(String[] args) {
        var distinctWords = words.stream()
                .map(DistinctString::new)
                .distinct()
                .map(DistinctString::string)
                .toList();

        System.out.println(distinctWords);
    }
}
