package com.giantwavetech.javastreams.task04_concatenate_strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Streams", "Practice");

        // Concatenate strings using streams
        String result = words.stream()
                .collect(Collectors.joining(","));

        System.out.println("Result: " + result);
    }
}
