package pl.net.banach;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Ex6_Parallel_ForkJoin {
    private static String someCall(Integer integer) {
        try {
            Thread.sleep(1_000);
            return integer.toString();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var jobCount = 20;

        // Hack to run stream on different fork join - should not be used ;-)
        try (var join = new ForkJoinPool(50)) {
            join.execute(() -> {
                var start = Instant.now();

                var stream = IntStream.range(0, jobCount).boxed()
                                      .parallel()
                                      .map(Ex6_Parallel_ForkJoin::someCall)
                                      .toList();

                var duration = Duration.between(start, Instant.now());

                System.out.printf("Took %s to make %d calls to get %n%s%n", duration, jobCount, stream);
            });
            join.awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
