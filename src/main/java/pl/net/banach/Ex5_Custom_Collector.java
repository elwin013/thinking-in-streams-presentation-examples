package pl.net.banach;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex5_Custom_Collector {
    private static final List<String> words = Arrays.asList(
            "level", "radar", "apple", "noon", "civic",
            "banana", "deified", "refer", "rotor", "kayak",
            "window", "madam", "orange", "table", "racecar"
    );


    public static void main(String[] args) {
        System.out.println("Using custom collector the class is:");
        var collected = words.stream().collect(toLinkedList());

        System.out.println(collected.getClass());

        System.out.println("Using built in Collectors.toCollection the class is:");
        var collected2 = words.stream().collect(Collectors.toCollection(LinkedList::new));

        System.out.println(collected2.getClass());
    }

    private static <T> Collector<T, LinkedList<T>, LinkedList<T>> toLinkedList() {
        return new Collector<>() {

            @Override
            public Supplier<LinkedList<T>> supplier() {
                return LinkedList::new;
            }

            @Override
            public BiConsumer<LinkedList<T>, T> accumulator() {
                return LinkedList::add;
            }

            @Override
            public BinaryOperator<LinkedList<T>> combiner() {
                return (list1, list2) -> {
                    list1.addAll(list2);
                    return list1;
                };
            }

            @Override
            public Function<LinkedList<T>, LinkedList<T>> finisher() {
                return Function.identity();
            }

            @Override
            public Set<Characteristics> characteristics() {
                return Set.of(Characteristics.IDENTITY_FINISH);
            }
        };
    }

    private static <T> Collector<T, LinkedList<T>, LinkedList<T>> toLinkedListBis() {
        return Collector.of(
                LinkedList::new,
                LinkedList::add,
                (list1, list2) -> {
                    list1.addAll(list2);
                    return list1;
                },
                Collector.Characteristics.IDENTITY_FINISH
        );
    }


}
