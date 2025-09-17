package pl.net.banach;

import java.util.Random;
import java.util.stream.Stream;

public class PeekCanBeOmittedExample2 {

    public static void main(String[] args) {
        var random = new Random();
        var numbers = Stream.generate(() -> random.nextInt(10)).limit(10);

        System.out.println("Stream from List");
        System.out.println(processStream(numbers.toList().stream()));

        numbers = Stream.generate(() -> random.nextInt(10)).limit(10);
        System.out.println("Plain stream");
        System.out.println(processStream(numbers));
    }

    static long processStream(Stream<Integer> coll) {
        return coll.peek(System.out::println).count();
    }
}
