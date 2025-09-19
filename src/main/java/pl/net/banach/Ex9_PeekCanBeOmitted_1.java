package pl.net.banach;

import java.util.List;

public class Ex9_PeekCanBeOmitted_1 {

    public static void main(String[] args) {
        var numbers = List.of(10, 4, 7, 1, 8, 2, 5, 9, 3, 6);
        var count = numbers.stream()
                           .peek(System.out::println)
                           .count();
        System.out.println("Count: " + count);
    }
}
