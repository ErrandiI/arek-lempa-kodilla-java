package com.kodilla.good.patterns.challanges.module13FirstTask;

import com.kodilla.good.patterns.challanges.module13FirstTask.MovieStore;

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
