package pl.net.banach;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class Ex6_Parallel {
    private static String apiAction(Integer integer) {
        try {
            Thread.sleep(1_000);
            return integer.toString();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var jobCount = 10;
        var start = Instant.now();

        var stream = IntStream.range(0, jobCount).boxed()
//                              .parallel() // Uncomment to make it parallel
                              .map(Ex6_Parallel::apiAction)
//                              .gather(Gatherers.mapConcurrent(jobCount, Ex6_Parallel_vol2::apiAction)) // Gatherer version
                              .toList();

        var duration = Duration.between(start, Instant.now());

        System.out.printf("Took %s to make %d calls to get %n%s%n", duration, jobCount, stream);
    }
}
