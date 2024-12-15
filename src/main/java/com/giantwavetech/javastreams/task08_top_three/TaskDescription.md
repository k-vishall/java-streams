# Task 8: Top Three Highest Values

## Objective
Learn to find the top N elements in a list using streams.

## Instructions:
1. Given a list of integers, find the top three highest values.
2. Print the three values.

## Example Input:
```java
List<Integer> numbers = Arrays.asList(10, 30, 20, 50, 40, 60);
```

## Expected Output:
- Top 3 Values: `[60, 50, 40]`

## Hints:
- Use `sorted(Comparator.reverseOrder())` and `limit()`.
