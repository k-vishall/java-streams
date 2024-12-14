package com.giantwavetech.javastreams.task07_flatten_lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        // Flatten nested lists
        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened List: " + flattenedList);
    }
}
