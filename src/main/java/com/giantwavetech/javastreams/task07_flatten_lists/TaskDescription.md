# Task 7: Flatten Nested Lists

## Objective
Learn to work with nested lists and flatten them into a single list using streams.

## Instructions:
1. Given a list of lists of integers, flatten it into a single list.
2. Print the flattened list.

## Example Input:
```java
List<List<Integer>> nestedLists = Arrays.asList(
    Arrays.asList(1, 2, 3),
    Arrays.asList(4, 5),
    Arrays.asList(6, 7, 8)
);
```

## Expected Output:
- Flattened List: `[1, 2, 3, 4, 5, 6, 7, 8]`

## Hints:
- Use `flatMap()` to handle nested lists.
