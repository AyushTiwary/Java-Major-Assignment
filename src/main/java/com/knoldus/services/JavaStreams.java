package com.knoldus.services;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

    Boolean allMatch(int length) {
        Stream<String> stream = Stream.of("Ayush","Atul","Sumit");
        return stream.allMatch(text -> text.length() == length);
    }

    Boolean anyMatch(int length) {
        Stream<String> stream = Stream.of("Ayush","Atul","Sumit");
        return stream.anyMatch(text -> text.length() == length);
    }

    Boolean noneMatch(int length) {
        Stream<String> stream = Stream.of("Ayush","Atul","Sumit");
        return stream.noneMatch(text -> text.length() == length);
    }

    String collect(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.collect(Collectors.joining(","));
    }

    long count(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.count();
    }

    Optional<String> findAny(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.findAny();
    }

    Optional<String> findFirst(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.findFirst();
    }


}
