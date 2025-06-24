# Thinking in Streams - presentation examples

All examples tested using Oracle OpenJDK 24.

Examples:
* `Ex0_*` are the playgrounds to live code
* `Ex1_A_Stream.java` presents the simple stream - removing empty strings from the text.
* `Ex1_IntermediateOperation.java` presents stream with only intermediate operation - stream is not executed.
* `Ex2_TerminalOperation.java` presents stream with both intermediate and terminal operation - stream is executed.
* `Ex3_Intermediate_Operations_Continued.java` presents various intermediate operations - map, limit, count, filter.
* `Ex4_Multiple_steps.java` presents laziness of the streams.
* `Ex5_Collectors.java` presents usage of collectors.
* `Ex5_Custom_Collector.java` presents how to write a custom collector.
* `Ex6_Parallel.java` presents parallel issues with streams and how Gatherers (mapConcurrent) solves the issue.
* `Ex7_First_Gatherer.java` presents reimplementation of map using Gatherers.
* `Ex7_Gatherer_DistinctBy.java` presents more sophisticated
* `Ex7_Window.java` presents using windowSliding to show anomalies in data.
* `Ex8_Movies.java` presents more examples with semi-real data (movie info).
