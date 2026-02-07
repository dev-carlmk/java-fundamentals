# Inner Classes in Java

## Overview
This project demonstrates the use of Inner Classes in Java.  
It covers different types of inner classes and how they interact with the outer class, showcasing their scope, accessibility, and practical use cases.

## Concepts Covered
- Private Inner Classes  
- Public Inner Classes  
- Inner Classes inside a Method  
- Static Nested Classes  
- Anonymous Inner Classes  

## Explanation

### 1. Private Inner Class
A private inner class can only be accessed inside its outer class.  
The outer class acts as a bridge, exposing behavior through its own methods.  
This encapsulation allows the outer class to hide complex implementation details and maintain a clean API.

### 2. Public Inner Class
A public inner class can be accessed by both the outer class and other classes  
(using the syntax `OuterClass.InnerClass`).  
This allows for more flexible designs where inner classes represent components closely tied to the outer class but still need to be used externally.

### 3. Inner Class Inside a Method
An inner class declared inside a method:
- Exists only within that method's scope
- Is used for localized logic that does not need to be exposed outside the method
- Cannot be accessed outside the method, ensuring tight encapsulation and reducing namespace pollution

### 4. Static Nested Class
Unlike inner classes, static nested classes do not have access to instance variables or methods of the outer class unless they have a reference to an instance.  
They behave like regular top-level classes but are nested for better organization.

### 5. Anonymous Inner Class
An anonymous inner class is a one-off class without a name, often used to implement interfaces or extend classes in place.  
They are useful for quick, inline implementations, especially in event handling or callbacks.

## Example Output
- Student belongs to the school  
- Teacher works at the school  
- Department is inside the school  

## Purpose
This exercise was done to:
- Understand scope and access control in Java  
- Practice Java Object-Oriented Programming (OOP) concepts  
- Build consistency with daily GitHub commits  
- Explore different inner class types and their use cases  
- Improve code organization and encapsulation techniques  

## How to Run
1. Clone the repository  
2. Compile the Java files using `javac`  
3. Run the main class with `java`  
4. Observe the output demonstrating inner class interactions  

## Author
T. Carlos Kerwillain