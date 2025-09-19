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
                        .peek(s -> System.out.println("Size, processing %s".formatted(s)))
                        .filter(s -> s.length() > 5)
                        .peek(s -> System.out.println("> Contains, processing %s".formatted(s)))
                        .filter(s -> s.contains("a"))
                        .peek(s -> System.out.println(">> Map to uppercase, processing %s".formatted(s)))
                        .map((String::toUpperCase))
                        .toList();


        System.out.println(list);
    }


}
