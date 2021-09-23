# Cartesian Line Length Calculator

## Problem Description
- As a fan of geometry, I want to model a line based on points consisting of (x, y) coordinates using the cartesian system. So that I can calculate its length.
- The program should compare two lines or not based on the last point. The user will input 4 points and it will check the last point of each line.

## Pre-Requisite to Run The Program
- Have an IDE for Java installed (e.g. Netbeans, Intellij, Eclipse)
- JDK 11.0 or higher installed ([see this link for installation](https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html))
- JUnit 5.0 or higher installed, for running the tests ([see this link for installation](https://junit.org/junit5/docs/current/user-guide/#overview-getting-started-junit-artifacts))

## How to Use This Package

### Count The Length of a Line
```
Line line = new Line(1, 2, 3, 4);

double lineLength = line.calculateLength();
```

### Compare Two Lines Endpoints
```
Line line1 = new Line(0, 0, 0, 0);
Line line2 = new Line(0, 0, 0, 0);

boolean isEqual = line1.compareLine(line2);
```

## How to Build The Program
- Open a terminal
- Change the working directory into the current project directory
- Execute `./gradlew build` in your terminal

## How to Run The Program
Can't, since this is a library only

## How to Run The Tests
- Open a terminal
- Change the working directory into the current project directory
- Execute `./gradlew test` in your terminal
