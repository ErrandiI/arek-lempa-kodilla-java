package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("Alfabet tu był", text -> "Tu nie ma alfabetu"));
        System.out.println(poemBeautifier.beautify("Alfabet tu był", text -> text + ". Tu nie ma alfabetu"));
        System.out.println(poemBeautifier.beautify("Alfabet tu był", text -> text + "ABC"));
        System.out.println(poemBeautifier.beautify("Alfabet tu był", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("ALFABET TU BYŁ", text -> text.toLowerCase()));




        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}