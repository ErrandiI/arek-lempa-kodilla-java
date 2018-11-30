package com.kodilla.good.patterns.challanges;

import java.util.stream.Collectors;

public class MovieStoreStream {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!", "", ""));

        System.out.println(result);
    }
}
