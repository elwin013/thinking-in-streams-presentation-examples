package pl.net.banach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex3_Intermediate_Operations_Continued {
    private static List<String> words = Arrays.asList(
            "level", "radar", "apple", "noon", "civic",
            "banana", "deified", "refer", "rotor", "kayak",
            "window", "madam", "orange", "table", "racecar"
    );


    public static void main(String[] args) {
        filter();
        map();
        count();
    }

    private static void count() {
        var count = Stream.iterate(0, i -> i + 1)
                          .map(i -> i + 1)
                          .limit(5)
                          .count();
        System.out.print("Counting with limit: " + count);
    }

    public static void filter() {
        var wordsLongerThan5 = words.stream()
                                    .filter(word -> word.length() > 5)
                                    .toList();

        System.out.println("Words longer than 5: " + wordsLongerThan5);
    }

    public static void map() {
        var lowerCased = words.stream()
                              .map(String::toLowerCase)
                              .toList();

        System.out.println("Lowercased: " + lowerCased);

    }
}
