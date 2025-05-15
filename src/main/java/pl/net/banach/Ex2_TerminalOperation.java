package pl.net.banach;

import java.util.List;

public class Ex2_TerminalOperation {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var numbersDoubled = numbers.stream().map((integer -> {
            System.out.println("Processing " + integer);
            return integer * 2;
        })).toList();

        System.out.println(numbersDoubled);
    }
}

