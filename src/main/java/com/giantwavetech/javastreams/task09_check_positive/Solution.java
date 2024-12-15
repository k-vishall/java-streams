package com.giantwavetech.javastreams.task09_check_positive;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, -30, 40, 50);
        boolean allPositive = numbers.stream().allMatch(num -> num > 0);
        System.out.println("Result: " + allPositive);
    }
}
