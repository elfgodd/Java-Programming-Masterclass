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

## Section 3: First Steps

### 1. Primitive Types

The eight primitive data types in Java are boolean, byte, char, short, int, long, float
and double. Consider these types as the building blocks of data manipulation.

### 2. The char and boolean Primitive Data

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

### 3. Primitive Types Recap and the String Data Type

The **String** is a datatype in Java, which is not a primitve type. It's actually a **Class**,
but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.

- What is a String?:
  A **String** is a sequence of characters. In the case of the **char**, it could contain a **single character** only(regular character or Unicode character).

A **String** can contain a sequence of characters. A large number of characters. Technically it's
limited by memory or the **MAX_VALUE** of an **int** which was **2.14 Billion**. That's a lot
of characters.

**Strings** in Java are immutable. Tah means you can't change a **String** after it's created. Instead, what happens is a new **String** is created.

### 4. Ternary Operator

**int ageOfClient = 20;**
**boolean isEighteenOrOver = ageOfClient == 20 ? true : false;**

Operand one - **ageOfClient == 20;** in this case is the condition we are checking.
It needs to return **true** or **false**

Operand two - **true** here is the value to assign to the variable **isEighteenOrOver**
if the condition above is **true**

Operand three - **false** here is the value to assign to the variable **isEighteenOrOver**
if the condition above was **false**

It can be a good idea to use **parentheses** like this to make the code more readable

**boolean is EighteenOrOver = (ageOfClient == 20) ? true : false**

### 5. Operator Precedence and Operator Challenge

Summary of Operators:  
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

Java Operator Precedence Table:  
http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

## Section 4: Java Tutorial: Expressions, Statements, Code blocks, Methods and more

### 1. Keywords And Expressions

List of Java keywords:  
https://en.wikipedia.org/wiki/List_of_Java_keywords

### 2. Method Overloading

- **Method overloading** is a feature that allows us to have more than one method
  with the **same name**, so long as we use **different parameters**.
- It is the ability to create multiple methods of the same name with different implementations.
- Calls to an overloaded method will run a specific implementation of that method.
- Same name easier to remember

```
public static int sum (int a, int b) {
  return a + b;
}
public static int sum (int a, int b, int c) {
  return a + b + c;
}
public static int sum (int a, int b, int c, int d) {
  return a + b + c + d;
}
```

## Section 5: Control Flow Statements

### 1. The While, Do While break and continue Recap

- The **while** loop checks the condition at the start before executing the block.
- With the **do while** loop the code block is executed at least once and then
  the condition is checked.
- Be careful with conditions, it is **easy** to end up with endless loop in other
  words a loop that never ends or to end up with loop that never executes.
- **Tip: always check your conditions/expressions.**

- We can interrupt the loop by using a **continue** and/or a **break** statement.
- With the **continue** keyword the loop will bypass the part of code block that
  is below the **continue** keyword and continue with the next iteration.
- With the **break** keyword we can exit the loop depending on the condition
  that we are checking.

## Section 6: OOP Part 1 - Classes, Constructors, and Inheritance

### 1. Method Overloading vs Overriding Recap

**Method Overloading**

- provides functionality to reuse a method name with different parameters.
- Usually in a single class but may also be used in a child class.
- **Must have** different parameters.
- May have different return types.
- May have different access modifiers (private, protected, public).
- May throw different exceptions.

**Method Overriding**

- Used to override a behavior which the class has inherited from the parent class.
- **Always in two classes** that have a child-parent or IS-A relationship.
- **Must have** the same parameters and same name.
- Must have the same return type or covariant return type (child class).
- **Must NOT** have a lower modifier but may have a higher modifier.
- **Must NOT** throw a new or broader checked exception.

### 2. Static vs Instance Methods

- **Static methods** are declared using a **static** modifier.
- **Static methods can't** access instance methods and instance variables directly.
- They are usually used for operations that don't require any data from an instance
  of the class (from 'this').
- If you remember, the this keyword is the current instance of a class.
- In **static methods** we can't use the **this** keyword.
- Whenever you see a method that **does not use instance variables** that method
  should be declared as a **static method**.
- For example main is a static method and it is called by the JVM when it starts an application

- **Instance Methods** belong to an instance of a class.
- To use an **instance method** we have to instantiate the class first usually by using the
  **new** keyword.
- **Instance methods** can access instance methods and instance variables directly.
- **Instance methods** can also access static methods and static variables directly.

Should a method be static?
Does it use any fields (instance variables) or instance methods?
**Yes**: It should probably be an **instance method**
**No**: It should probably be a **static method**

### 3. Static vs Instance Variables

- Declared by using the keyword static.
- **Static variables** are also known as **static member variables**.
- Every instance of that class **shares** the same static variable\*\*
- If changes are made to that variable, all other instances will see
  the effect of the change.
- **Static variables** are not used very often but can sometimes be very useful.
- For example when reading user input using **Scanner** we will declare scanner
  as a static variable.
- That way **static methods** can access it directly.
- The **don't** use the **static** keyword.
- Instance variables are also known as fields or member variables.
- **Instance variables** belong to an instance of a class.
- Every instance has it's own copy of an instance variable.
- Every instance can have a different value (state).
- Instance variables represent the state of an instance.
