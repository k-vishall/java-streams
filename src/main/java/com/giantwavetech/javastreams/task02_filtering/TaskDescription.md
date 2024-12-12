# Task 2: Filtering and Mapping

## Objective
Understand intermediate operations in streams like `filter`, `map`, and `flatMap`.

## Instructions:
Write a Java program that performs the following operations on a list of strings:
1. Filter out strings that have more than 4 characters.
2. Convert the remaining strings to uppercase.
3. Collect and print the transformed strings as a new list.

## Example Input:
```java
List<String> words = Arrays.asList("cat", "house", "dog", "elephant", "rat");
```

## Expected Output:
- Transformed List: `[HOUSE, ELEPHANT]`

## Hints:
- Use `filter()` to keep only strings with length >= 4.
- Use `map()` to transform each string to uppercase.
- Use `collect(Collectors.toList())` to create a new list.
