package pl.net.banach;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Gatherers;

import static java.time.LocalDateTime.parse;

public class Ex7_Window {
    public record Reading(LocalDateTime timestamp, double temperature) {
        static Reading of(String timestamp, double temperature) {
            return new Reading(parse(timestamp), temperature);
        }
    }

    public static List<Reading> readings = Arrays.asList(
            Reading.of("2025-05-14T08:00:00", 20.5),
            Reading.of("2025-05-14T08:15:00", 20.8),
            Reading.of("2025-05-14T08:30:00", 20.4),
            Reading.of("2025-05-14T08:45:00", 21.0),
            Reading.of("2025-05-14T09:00:00", 21.2),
            Reading.of("2025-05-14T09:15:00", 21.1),
            Reading.of("2025-05-14T09:30:00", 20.9),
            Reading.of("2025-05-14T09:45:00", 21.0),
            Reading.of("2025-05-14T10:00:00", 20.7),
            Reading.of("2025-05-14T10:15:00", 21.3),
            Reading.of("2025-05-14T10:30:00", 27.4),
            Reading.of("2025-05-14T10:45:00", 22.2),
            Reading.of("2025-05-14T11:00:00", 23.8),
            Reading.of("2025-05-14T11:15:00", 21.9),
            Reading.of("2025-05-14T11:30:00", 22.1),
            Reading.of("2025-05-14T11:45:00", 23.0),
            Reading.of("2025-05-14T12:00:00", 23.8),
            Reading.of("2025-05-14T12:15:00", 29.7),
            Reading.of("2025-05-14T12:30:00", 23.5),
            Reading.of("2025-05-14T12:45:00", 23.6)
    );

    public static void main(String[] args) {
        var anomaly = readings.stream()
                              .gather(Gatherers.windowSliding(2))
                              .filter(window ->
                                      window.getLast().temperature - window.getFirst().temperature >
                                      5)
                              .toList();

        System.out.println(anomaly);
    }
}
