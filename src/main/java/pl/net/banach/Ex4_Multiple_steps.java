package pl.net.banach;

import java.util.Arrays;
import java.util.List;

public class Ex4_Multiple_steps {
    private static final List<String> words = Arrays.asList(
            "level", "radar", "apple", "noon", "civic",
            "banana", "deified", "refer", "rotor", "kayak",
            "window", "madam", "orange", "table", "racecar"
    );


    public static void main(String[] args) {
        var list = words.stream()
             .filter(string -> {
                 System.out.println("Size, processing %s".formatted(string));
                 return string.length() > 5;
             })
             .filter(string -> {
                 System.out.println("> Contains, processing %s".formatted(string));
                 return string.contains("a");
             })
             .map((string -> {
                 System.out.println(">> Map to uppercase, processing %s".formatted(string));
                 return string.toUpperCase();
             }))
                        .toList();

        System.out.println(list);
    }


}
