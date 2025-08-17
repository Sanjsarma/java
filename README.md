# Java Core Concepts and Examples

This repository contains a comprehensive collection of Java examples covering core concepts, design patterns, collections framework, and more. Each example is designed to demonstrate specific Java features and best practices.

## Table of Contents
- [Core Java](#core-java)
- [Object-Oriented Programming](#object-oriented-programming)
- [Design Patterns](#design-patterns)
- [Collections Framework](#collections-framework)
- [Concurrency](#concurrency)
- [Advanced Topics](#advanced-topics)
- [Getting Started](#getting-started)

## Core Java
- **MainMethod.java**: Demonstrates the `main` method variations and command-line arguments
- **VarargsCalculator.java**: Shows variable arguments usage in Java methods
- **EnumClass.java**: Example of enum types and their usage
- **StaticVariables.java**: Demonstrates static variables and methods
- **Synchronization.java**: Basic thread synchronization examples

## Object-Oriented Programming
### Inheritance and Polymorphism
- **OverRiding.java**: Method overriding and runtime polymorphism
- **Overloading.java**: Method overloading and compile-time polymorphism
- **AbstractClass.java**: Abstract classes and methods
- **Interface/**: Contains interface examples and implementations
  - **Bird.java**: Basic interface example
  - **Eagle.java, Hen.java**: Interface implementations
  - **NestedInterfaceWithinClass.java**: Nested interfaces example

### Advanced OOP
- **InnerClassEg.java**: Different types of inner classes
- **LocalInnerClassEg.java**: Local inner classes
- **StaticNestedEg.java**: Static nested classes
- **InnerClassInheritance.java**: Inheritance with inner classes
- **PrivateCons.java**: Private constructors and singleton pattern
- **ImmutableClass.java**: Creating immutable classes

## Design Patterns
### Creational Patterns
- **EagerInitialisation.java**: Eager singleton pattern
- **LazyInitialization.java**: Lazy singleton pattern
- **BillPughSingleton.java**: Bill Pugh singleton implementation
- **DoubleCheckLocking.java**: Thread-safe singleton with double-checked locking
- **StaticInnerClassInheritance.java**: Static inner class singleton

### Structural Patterns
- **privateStaticNestedClass.java**: Private static nested class pattern

## Collections Framework
### List Implementations
- **ArrayListClass.java**: ArrayList usage and operations
- **LinkedListEg.java**: LinkedList as both List and Deque
- **VectorEg.java**: Thread-safe Vector implementation
- **StackEg.java**: Stack operations (LIFO)

### Queue Implementations
- **Queue.java**: PriorityQueue examples (min-heap and max-heap)
- **ArrayDequeClass.java**: ArrayDeque as both queue and stack

### Map Implementations
- **HashMapEg.java**: Basic HashMap operations
- **LinkedHashMapEg.java**: Maintains insertion order
- **TreeMapEg.java**: Sorted map implementation

### Utility Classes
- **CollectionMethods.java**: Basic collection operations
- **CollectionsMethods.java**: Utility methods from Collections class
- **IteratorEg.java**: Different ways to iterate collections
- **StreamEg.java**: Java 8+ Stream API examples

### Object Comparison
- **Car.java**: Simple POJO class
- **ComparableCar.java**: Implements Comparable interface
- **CarNameComparator.java**: Custom Comparator implementation
- **Comparator.java**: Sorting with Comparator and lambdas

## Concurrency
- **Thread-safe Collections**: Examples in respective collection classes
- **Synchronization.java**: Basic thread synchronization
- **ConcurrentLinkedDeque**: Used in ArrayDequeClass.java
- **CopyOnWriteArrayList**: Used in ArrayListClass.java

## Advanced Topics
- **Reflection/**: Java Reflection API examples
- **HeapPollutionEg.java**: Demonstrates heap pollution with varargs
- **ObjectTest.java**: Object class methods and their usage
- **MyCustomAnnotation.java**: Custom annotations example

## Getting Started

### Prerequisites
- Java JDK 11 or higher
- Maven (for dependency management, if applicable)

### Running Examples
1. Clone the repository
2. Navigate to the example directory
3. Compile and run using Java:
   ```bash
   javac Example.java
   java Example
   ```

## Contributing
Feel free to contribute by submitting issues or pull requests. Please ensure your code follows standard Java coding conventions.

## License
This project is open source and available under the [MIT License](LICENSE).

## Acknowledgments
- Oracle Java Documentation
- Effective Java by Joshua Bloch
- Java Concurrency in Practice by Brian Goetz
