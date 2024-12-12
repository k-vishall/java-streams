# Task 4: Concatenate Strings

## Objective
Learn to use streams to join elements of a list into a single string.

## Instructions:
1. Given a list of strings, concatenate them into a single string separated by commas.
2. Print the resulting string.

## Example Input:
```java
List<String> words = Arrays.asList("Java", "Streams", "Practice");
```

## Expected Output:
- Result: `Java,Streams,Practice`

## Hints:
- Use `Collectors.joining()` to concatenate elements with a delimiter.
