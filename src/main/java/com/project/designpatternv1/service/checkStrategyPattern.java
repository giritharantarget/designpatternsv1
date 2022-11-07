package com.project.designpatternv1.service;

import java.util.List;
import java.util.function.Predicate;

public class checkStrategyPattern {
    // 1. In the Past we created interface
    public static void main(String[] args) {
        var numbers = List.of(1,2,3,4);
        System.out.println(totalValues(numbers, e-> true));
        System.out.println(totalValues(numbers, checkStrategyPattern::isOdd));
    }

     // pass the functionality dynamically using predicate
    // Functional Interfaces as strategy
    // Receive strategy run time
    // Strategy are pure , since lamda are pure functions

    public static boolean isOdd(int number) {
       return  number %2 ==0;
    }

    public static int totalValues(List<Integer> numbers, Predicate<Integer> condition) {

       return  numbers.stream()
                .filter(condition)
                .mapToInt(e -> e)
                .sum();

    }
}
