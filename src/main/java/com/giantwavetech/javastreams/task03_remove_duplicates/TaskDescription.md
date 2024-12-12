# Task 3: Remove Duplicates

## Objective
Learn to process and remove duplicate elements from a list using Java Streams.

## Instructions:
Write a Java program that performs the following:
1. Given a list of integers, remove all duplicates.
2. Print the resulting list.

## Example Input:
```java
List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);
```

## Expected Output:
- Resulting List: `[1, 2, 3, 4, 5, 6]`

## Hints:
- Use the `distinct()` method in the stream pipeline.
- Collect the result using `Collectors.toList()`.
