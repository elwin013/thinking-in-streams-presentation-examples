package pl.net.banach;

import java.util.Random;
import java.util.stream.Stream;

public class Ex9_PeekCanBeOmitted_2 {
    public static void main(String[] args) {
        var random = new Random();

        var numbers = Stream.generate(() -> random.nextInt(10))
                            .limit(10);

        var count =  numbers
                .peek(System.out::println)
                .count();
        System.out.println("Count: " + count);
    }
}
