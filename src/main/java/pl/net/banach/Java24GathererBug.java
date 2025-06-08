package pl.net.banach;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Gatherer;

public class Java24GathererBug {

    static <T> Gatherer<T, ?, T> limit(int size) {
        class State {
            int count;
        }

        Supplier<State> initializer = State::new;
        Gatherer.Integrator<State, T, T> integrator = Gatherer.Integrator.of((state, element, downstream) -> {
            state.count++;
            if (state.count > size) {
                return false;
            }
            return downstream.push(element);
        });
        return Gatherer.ofSequential(initializer, integrator);
    }

    public static void main(String[] args) {
        // Gatherer examples with Java 24 are not working. But is fixed in Java 25.
        // Source: https://stackoverflow.com/questions/79622707/why-doesnt-my-gatherer-short-circuit-the-stream-if-the-source-is-an-intstream
        // Fix: https://github.com/openjdk/jdk/pull/25418

        var rng = new Random();

        // working - without gatherer
        var result1 =
                rng.ints(0, 10).boxed()
                   .limit(10)
                   .toList();
        System.out.println(result1);

        var result2 =
                rng.ints(0, 10).boxed()
                   .limit(10)
                   .toList();
        System.out.println(result2);

        // not working - with gatherer
        var result3 =
                rng.ints(0, 10).boxed()
                   .gather(limit(10))
                   .toList();
        System.out.println(result3);
//
//        var result4 =
//                rng.ints(0, 10).boxed()
//                   .gather(limit(10))
//                   .toList();
//        System.out.println(result4);
    }


}

