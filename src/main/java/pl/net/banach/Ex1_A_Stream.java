package pl.net.banach;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex1_A_Stream {
    public static void main(String[] args) {
        var sentence = "Set phasers  to stun"; // note additional space
        var source = Arrays.asList(sentence.split(" "));

        System.out.println("Sentence: " + sentence);
        System.out.println("Source: " + source);

        var result =
                source.stream()
                      .filter(Predicate.not(String::isEmpty))
                      .map(String::toUpperCase)
                      .toList();

        System.out.println("Result: " + result);

        System.out.println("Result, joined: " + result.stream().collect(Collectors.joining(" ")));
    }
}
