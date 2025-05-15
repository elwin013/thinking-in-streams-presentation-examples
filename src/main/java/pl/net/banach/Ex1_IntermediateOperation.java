package pl.net.banach;

import java.util.List;

public class Ex1_IntermediateOperation {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().map((integer -> {
            System.out.println("Processing " + integer);
            return integer * 2;
        }));
    }
}

