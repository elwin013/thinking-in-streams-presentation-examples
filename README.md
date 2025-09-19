# Thinking in Streams - example code used during presentation (and more)

All examples tested using Oracle OpenJDK 25 (available at https://jdk.java.net/25/).

Examples:
* `Ex1_A_Stream.java` presents the simple stream—removing empty strings from the text mapping to uppercase.
* `Ex2_IntermediateOperation.java` presents stream with only intermediate operation - stream is not executed.
* `Ex3_TerminalOperation.java` presents stream with both intermediate and terminal operation - stream is executed.
* `Ex4_Multiple_steps.java` presents laziness of the streams.
* `Ex5_Collectors.java` presents usage of collectors.
* `Ex5_Custom_Collector.java` presents how to write a custom collector.
* `Ex6_Parallel.java` presents parallel issues with streams and how Gatherers (mapConcurrent) solves the issue.
* `Ex6_Parallel_ForkJoin.java` presents a (hacky) way to overcome common ForkJoinPoll.
* `Ex7_A_First_Gatherer.java` presents reimplementation of map using Gatherers.
* `Ex7_Classic_DistinctBy.java` presents classic (w/o using Gatherers) implementation of distinctBy (length)
* `Ex7_Gatherer_DistinctBy.java` presents distinctBy (any function) using Steram Gatherers
* `Ex7_Window.java` presents using windowSliding to show anomalies in data.
* `Ex8_Loops_Movies.java` presents more examples with loops with semi-real data (movie info)
* `Ex8_Movies.java` presents more examples with streams semi-real data (movie info).
* `Ex9_PeekCanBeOmitted_1.java` presents how peek is omitted when using count on stream with easy accessible number of items. 
* `Ex9_PeekCanBeOmitted_2.java` presents situation when peek will not be omitted. 

