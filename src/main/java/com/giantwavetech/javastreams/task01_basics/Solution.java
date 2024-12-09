package com.giantwavetech.javastreams.task01_basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 6, 7, 8};

        // 1. Print each number in the array
        System.out.println("Numbers in the array:");
        Arrays.stream(numbers).forEach(System.out::println);

        // 2. Count how many even numbers are present
        long evenCount = Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .count();
        System.out.println("Count of even numbers: " + evenCount);

        // 3. Create a new list of squared values for numbers greater than 5
        List<Integer> squaredValues = Arrays.stream(numbers)
                .filter(num -> num > 5)
                .map(num -> num * num)
                .boxed() // Convert int to Integer
                .collect(Collectors.toList());
        System.out.println("List of squares of numbers greater than 5: " + squaredValues);
    }
}
