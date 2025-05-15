package pl.net.banach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5_Collectors {
    private static final List<String> words = Arrays.asList(
            "level", "radar", "apple", "noon", "civic",
            "banana", "deified", "refer", "rotor", "kayak",
            "window", "madam", "orange", "table", "racecar"
    );


    public static void main(String[] args) {
        groupBySize();

        formatNicely();
    }



    private static void groupBySize() {
        System.out.println("Grouping by size");

        var groupedBySize = words.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));

        groupedBySize.forEach((integer, strings) -> System.out.println(integer + "->" + strings));
    }

    private static void formatNicely() {
        System.out.println("Formatting nicely with collector");

        var builder = new StringBuilder("[");
        for (var word : words) {
            if (builder.length() > 1) {builder.append(",");}
            builder.append("\"").append(word).append("\"");
        }
        builder.append("]");

        System.out.println(builder.toString());

        var result = words.stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(",", "[", "]"));


        System.out.println(result);
    }
}
