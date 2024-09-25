# Linked List Exercises in Java

This project is a collection of **20 exercises** that focus on basic operations with **singly linked lists** in Java. Each exercise manipulates a linked list structure and showcases various operations like insertion, deletion, traversal, reversing the list, and more.

## Table of Contents

- [Linked List Exercises in Java](#linked-list-exercises-in-java)
  - [Table of Contents](#table-of-contents)
  - [Description](#description)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Usage](#usage)
    - [Example](#example)
  - [Exercises](#exercises)
    - [Exercise 1 to 5](#exercise-1-to-5)
    - [Exercise 6 to 10](#exercise-6-to-10)
    - [Exercise 11 to 15](#exercise-11-to-15)
    - [Exercise 16 to 20](#exercise-16-to-20)
  - [Contribution](#contribution)

## Description

This project contains solutions to **20 exercises** aimed at practicing linked list operations in Java. Each exercise is implemented as a separate method within the `LinkedListExercises` class, and it includes:
- **Creation** of linked lists
- **Traversal** of linked lists
- **Insertion** of nodes
- **Deletion** of nodes
- **Reversing** the linked list
- **Merging** two linked lists
- **Circular lists**

For each exercise, the code prints the **initial state** of the list and the **final state** after performing the operation.

## Prerequisites

- **Java 8 or higher**
- An IDE like **Eclipse**, **IntelliJ IDEA**, or **VSCode** (optional, but recommended)

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Dennis290699/LinkedListExercises.git
    ```
2. **Navigate to the project directory**:
    ```bash
    cd LinkedListExercises
    ```

3. **Open the project in your preferred Java IDE** (e.g., Eclipse or IntelliJ IDEA).

## Usage

1. Once the project is set up in your IDE, locate the file `LinkedListExercises.java`.
2. Run the `main` method in the class `LinkedListExercises`.
3. The output will be printed in the console, showing both the **initial** and **final** state of the linked lists for each exercise.

### Example

To run the exercises and see the outputs:

```java
public static void main(String[] args) {
    LinkedListExercises exercises = new LinkedListExercises();
    
    exercises.ejercicio1();
    exercises.ejercicio2();
    // ...
    exercises.ejercicio20();
}
```

Each method represents an individual exercise. You can comment out or selectively run exercises by calling the corresponding method.

## Exercises

### Exercise 1 to 5
- **Exercise 1**: Assign `p` to refer to a node with `info` '2'.
- **Exercise 2**: Assign both `p` and `q` to point to nodes with `info` '1' and '2'.
- **Exercise 3**: Assign `q` to refer to a node with `info` '1'.
- **Exercise 4**: Assign `r` to refer to a node with `info` '2'.
- **Exercise 5**: Set `p.info` equal to `r.info` without directly accessing the value '3'.

### Exercise 6 to 10
- **Exercise 6**: Redo Exercise 5, but only using `p`.
- **Exercise 7**: Make the list circular by referencing both `p` and `r`.
- **Exercise 8**: Make the list circular by referencing both `p` and `q`.
- **Exercise 9**: Make the list circular using only `p`.
- **Exercise 10**: Remove the node with `info` 'B' using both `p` and `q`.

### Exercise 11 to 15
- **Exercise 11**: Remove the node with `info` 'B' using only `p`.
- **Exercise 12**: Traverse the list using `q` until it refers to the last node.
- **Exercise 13**: Traverse the list until `q` refers to the first node with lowercase 'c'.
- **Exercise 14**: Create a linked list with nodes 'A', 'B', 'C', 'D'.
- **Exercise 15**: Insert a node with `info` 'A' at the start of the list.

### Exercise 16 to 20
- **Exercise 16**: Insert a node with `info` 'D' at the end of the list.
- **Exercise 17**: Move the first node to the end of the list.
- **Exercise 18**: Redo Exercise 17 using only `p`.
- **Exercise 19**: Merge two lists (`p` and `q`) in sorted order.
- **Exercise 20**: Reverse the order of the nodes in the list.

## Contribution

Contributions are welcome! If you have ideas for improving the project or find any issues, feel free to open an issue or create a pull request.

To contribute:

1. **Fork the repository**.
2. **Create a new branch** for your feature/bugfix.
    ```bash
    git checkout -b feature-name
    ```
3. **Commit your changes**.
    ```bash
    git commit -m "Add feature"
    ```
4. **Push to your branch**.
    ```bash
    git push origin feature-name
    ```
5. **Open a pull request** and describe your changes.
