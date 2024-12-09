# Task 1: Basics

## Objective
Learn the basics of Java Streams by:
1. Creating a stream from an array of integers.
2. Performing basic operations like `forEach`, `filter`, and `map`.

## Instructions
1. Write a Java program that performs the following operations on an array of integers:
   - Print each number in the array using a stream.
   - Count the number of even numbers in the array.
   - Create a new list of squares of numbers greater than 5.

2. Use Java Streams to achieve these results.

## Example Input
```java
int[] numbers = {1, 2, 3, 6, 7, 8};
```

## Expected Output
- Print:
  ```
  1
  2
  3
  6
  7
  8
  ```
- Count of even numbers: `3`
- New list of squares: `[36, 49, 64]`

## Hints
- Use `Arrays.stream()` to convert an array into a stream.
- Use `filter()` to select even numbers.
- Use `map()` to transform numbers into their squares.
- Use `collect(Collectors.toList())` to collect the results into a list.
