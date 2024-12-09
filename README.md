
# Java Streams Practice

Welcome to the **Java Streams Practice Repository**! This repository is intended to help you learn, revise, and strengthen your understanding of Java Streams through a series of tasks. Each task focuses on a specific concept, progressing from basics to advanced topics.

---

## Table of Contents

1. [Basics of Streams](#1-basics-of-streams)

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
