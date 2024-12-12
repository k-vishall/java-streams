package com.giantwavetech.javastreams.task02_filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "house", "dog", "elephant", "rat");

        // Filter and map the strings
        List<String> transformedWords = words.stream()
                .filter(word -> word.length() >= 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Transformed List: " + transformedWords);
    }
}
