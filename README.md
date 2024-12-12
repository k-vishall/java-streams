
# Java Streams Practice

Welcome to the **Java Streams Practice Repository**! This repository is intended to help you learn, revise, and strengthen your understanding of Java Streams through a series of tasks. Each task focuses on a specific concept, progressing from basics to advanced topics.

---

## Table of Contents

1. [Basics of Streams](#1-basics-of-streams)
2. [Filtering and Mapping](#2-filtering-and-mapping)
3. [Remove Duplicates](#3-remove-duplicates)
4. [Concatenate Strings](#4-concatenate-strings)

---

### 1. Basics of Streams

**Problem:** Introduce basic operations with Java Streams.

**Objective:** Use streams to:
1. Print elements in a stream.
2. Filter even numbers.
3. Map and collect squared values.

**Example Code:**
```java
int[] numbers = {1, 2, 3, 6, 7, 8};
Arrays.stream(numbers)
      .filter(num -> num % 2 == 0)
      .forEach(System.out::println);
```

---

### 2. Filtering and Mapping

**Problem:** Process a list of strings using filtering and mapping.

**Objective:** 
1. Filter out strings shorter than 4 characters.
2. Convert remaining strings to uppercase.
3. Collect results into a list.

**Example Code:**
```java
List<String> words = Arrays.asList("cat", "house", "rat");
List<String> filtered = words.stream()
                             .filter(word -> word.length() >= 4)
                             .map(String::toUpperCase)
                             .collect(Collectors.toList());
```

---

### 3. Remove Duplicates

**Problem:** Eliminate duplicate integers in a list.

**Objective:** Remove duplicates using `distinct()`.

**Example Code:**
```java
List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4);
List<Integer> uniqueNumbers = numbers.stream()
                                     .distinct()
                                     .collect(Collectors.toList());
```

---

### 4. Concatenate Strings

**Problem:** Join strings into a single delimited string.

**Objective:** Use `Collectors.joining()` to concatenate strings with commas.

**Example Code:**
```java
List<String> words = Arrays.asList("Java", "Streams", "Practice");
String result = words.stream()
                     .collect(Collectors.joining(","));
```

## How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/java-streams-practice.git
   cd java-streams-practice
   ```
2. Navigate to the task of your choice.
3. Open the `TaskDescription.md` and `Solution.java` for that task.
4. Run the example in your IDE (NetBeans, IntelliJ IDEA, etc.) to test.

---
