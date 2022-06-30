# Java Programming Masterclass covering Java 11 & Java 17

Learn Java In This Course And Become a Computer Programmer. Obtain valuable Core Java Skills And Java Certification
Instructor: Tim Buchalka  
Course Repository:  
Course Link: https://udemy.com/course/java-the-complete-java-developer-course/

## What you'll learn

- Learn the core Java skills needed to apply for Java developer positions in just 14 hours.
- Be able to demonstrate your understanding of Java to future employers.
- Acquire essential java basics for transitioning to the Spring Framework, Java EE, Android development and more.
- Be able to sit for and pass the Oracle Java Certificate exam if you choose.
- Learn industry "best practices" in Java software development from a professional Java developer who has worked in the language for 18 years.
- Obtain proficiency in Java 8 and Java 11.

## Course content

25 sections • 401 lectures • 80h 23m total length

- Course Introduction
- Software Tools Setup
- First Steps
- Java Tutorial: Expressions, Statements, Code blocks, Methods and more
- Control Flow Statements
- OOP Part 1 - Classes, Constructors, and Inheritance
- OOP Part 2 - Composition, Encapsulation, and Polymorphism
- Arrays, Java inbuilt Lists, Autoboxing and Unboxing
- Inner and Abstract Classes & Interfaces
- Java Generics
- Naming Conventions and Packages. static and final keywords
- Java Collections
- JavaFX
- Basic Input & Output including java.util
- Concurrency in Java
- Lambda Expressions
- Regular Expressions
- Debugging and Unit Testing
- Databases
- Java Networking Programming
- Java 9 Module System
- Migrating Java Projects to Java 9
- Course Remaster in Progress
- Archived Videos
- Extra Information - Source code, and other stuff

## Section 1: Course Introduction

## Section 2: Software Tools Setup

### 1. Java Development Kit Installation Overview

Choosing The Right JDK Vendor and JVM:  
https://www.youtube.com/watch?v=zf-GOkc3Ht8

Java Development Kit: What Version of the JDK Should You Use?:  
https://www.youtube.com/watch?v=HqU0TF4XNbM

### 2. Install JDK 11 for Windows

Amazon Corretto 11:  
https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html
`java --version`

### 3. Run Java in VSCode

https://www.youtube.com/watch?v=OhofTsLJc8Q

1. Install: Extension Pack for Java VSCode
2. ctrl + shift + p
3. Search for: Create Java Project
4. Select: No Build Tools
5. Select or Create a project folder
6. Type project name "HelloWorld"
7. Open the src/App.java file
8. Click save it will download and IntelliCode models
9. Click on RUN
10. Open the Console and see the output

### 4. Primitive Types

The eight primitive data types in Java are boolean, byte, char, short, int, long, float
and double. Consider these types as the building blocks of data manipulation.

### 5. The char and boolean Primitive Data

A **char** occupies two bytes of memory, or **16 bits** and thus has a
width of **16**. The reason it's not just a **single byte** is taht it
allows you store Unicode characters.

**Unicode** is an international encoding standard for use with different languages and scripts,
by which each letter, digit, or symbol is assigned a unique numeric value that applies across
different platforms and programs

https://unicode-table.com/en/

A **boolean** value allows for two choices **True** or **False**, **Yes** or **No**, **1** or **0**.
In Java terms we have a **boolean** primitive type and it can be set to two values only.
**true** or **false**. They are actually pretty useful and you will use them a lot when programming

### 6. Primitive Types Recap and the String Data Type

The **String** is a datatype in Java, which is not a primitve type. It's actually a **Class**,
but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.

- What is a String?:
  A **String** is a sequence of characters. In the case of the **char**, it could contain a **single character** only(regular character or Unicode character).

A **String** can contain a sequence of characters. A large number of characters. Technically it's
limited by memory or the **MAX_VALUE** of an **int** which was **2.14 Billion**. That's a lot
of characters.

**Strings** in Java are immutable. Tah means you can't change a **String** after it's created. Instead, what happens is a new **String** is created.
