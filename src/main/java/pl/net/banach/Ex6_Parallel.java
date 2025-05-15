package pl.net.banach;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Gatherers;
import java.util.stream.IntStream;

public class Ex6_Parallel {
    private static String someCall(Integer integer) {
        try {
            Thread.sleep(1_000);
            return integer.toString();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var jobCount = Util.getNoOfProcessors();
        mapParallel(jobCount);

        // more than cpus
        mapParallel(jobCount + 1);

        // Hack to run stream on different fork join - should not be used ;-)
        var join = new ForkJoinPool(20);
        join.execute(() -> mapParallel(jobCount + 1));
        join.awaitTermination(1, TimeUnit.MINUTES);

        // Gatherers.mapConcurrent with virtual threads!
        mapWithConcurrentMap(jobCount);
    }


    private static void mapParallel(int jobCount) {
        var start = Instant.now();

        var stream = IntStream.range(0, jobCount).boxed()
                              .parallel()
                              .map(Ex6_Parallel::someCall)
                              .toList();

        var duration = Duration.between(start, Instant.now());

        System.out.printf("Took %s to make %d calls to get %n%s%n", duration, jobCount, stream);
    }

    private static void mapWithConcurrentMap(int jobCount) {
        var start = Instant.now();

        var stream = IntStream.range(0, jobCount).boxed()
                              .parallel()
                              .gather(Gatherers.mapConcurrent(jobCount, Ex6_Parallel::someCall))
                              .toList();

        var duration = Duration.between(start, Instant.now());

        System.out.printf("Took %s to make %d calls to get %n%s%n", duration, jobCount, stream);
    }




}
