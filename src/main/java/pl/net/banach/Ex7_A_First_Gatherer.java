package pl.net.banach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Gatherer;

public class Ex7_A_First_Gatherer {
    private static final List<String> words = Arrays.asList(
            "Level", "Radar", "Apple", "Noon", "Civic",
            "Banana", "Deified", "Refer", "Rotor", "Kayak",
            "Window", "Madam", "Orange", "Table", "Racecar"
    );

    public static void main(String[] args) {
        var classicMap = words.stream()
                              .map(String::toLowerCase)
                              .toList();
        System.out.println(classicMap);

        var gathererMap = words.stream()
                               .gather(map(String::toLowerCase))
                               .toList();

        System.out.println(gathererMap);
    }


    private static <T, R> Gatherer<T, ?, R> map(Function<T, R> mapper) {
        return Gatherer.ofSequential(
                (_, element, sink) -> sink.push(mapper.apply(element))
        );
    }

}
