package com.project.designpatternv1.service;

import java.util.List;

public class checkIteratorPattern {

    public static void main(String[] args) {

        names();

    }

    public static void names() {
        // 1. Dont use external Iterator
        var names = List.of("hello","check","tik");

        for (String name : names) {
            if (name.length()==5) {

            }
        }

        // 2. Use Internal Iterator
                // limit or takeWhile functional equivalent to functional imperative style

        names.stream()
                .filter(e-> e.length()==5)
                //.takeWhile()
                .map(String::toString)
                .forEach(System.out::println);
        // 3. It is important make the functional pipeline pure by avoid shared mutability

        // 4. What is pure function
                // a. A pure functional idempotent returns same output for the same input

    }
}
