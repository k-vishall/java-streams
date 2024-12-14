package com.giantwavetech.javastreams.task06_sort_strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "orange", "grape");

        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted: " + sortedWords);
    }
}
