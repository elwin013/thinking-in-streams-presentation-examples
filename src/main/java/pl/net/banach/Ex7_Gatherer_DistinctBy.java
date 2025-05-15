package pl.net.banach;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Gatherer;

public class Ex7_Gatherer_DistinctBy {
    private static final List<String> words = Arrays.asList(
            "Level", "Radar", "Apple", "Noon", "Civic",
            "Banana", "Deified", "Refer", "Rotor", "Kayak",
            "Window", "Madam", "Orange", "Table", "Racecar"
    );

    public static void main(String[] args) {
        var distinctWords = words.stream()
                                 .gather(distinctBy(String::length))
                                 .toList();

        System.out.println(distinctWords);
    }

    private static <T, P> Gatherer<T, ?, T> distinctBy(Function<T, P> function) {
        return Gatherer.ofSequential(() -> new HashSet<P>(),
                (state, element, downstream) -> {
                    if (!downstream.isRejecting()) {
                        if (state.add(function.apply(element))) {
                            downstream.push(element);
                        }
                    }

                    return true;
                }
        );
    }
}
