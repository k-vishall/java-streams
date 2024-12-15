package com.giantwavetech.javastreams.task08_top_three;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 30, 20, 50, 40, 60);

        // Find top three highest values
        List<Integer> topThree = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 Values: " + topThree);
    }
}
