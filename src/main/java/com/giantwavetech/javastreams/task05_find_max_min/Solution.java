package com.giantwavetech.javastreams.task05_find_max_min;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new IllegalArgumentException("List is empty"));

        int min = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow(() -> new IllegalArgumentException("List is empty"));

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}
