BDDLearning

A repository for learning and practising BDD (Behavior Driven Development) using Java.

Table of Contents

Overview

Features

Project Structure

Getting Started

Prerequisites

Setup

Running Tests

Technology Stack

Folder Layout

Reporting

How to Contribute

License

Contact

Overview

This project is a learning exercise for implementing Behavior-Driven Development (BDD) with Java. The goal is to write clear, well-structured acceptance tests, automate them, and generate reports.

Features

Use of BDD style tests (likely with frameworks like Cucumber or JBehave)

Automated test execution via build tools (Maven)

Generation of test reports

Example test suites to illustrate behaviour-driven development

Technology Stack

Java

Maven

Testing frameworks (unit / BDD)

Reporting tools

Possibly HTML / frontend for reports

Project Structure

Here is a high-level view of what’s inside the repository:

BDDLearning/
├── .settings/                ← IDE-specific settings  
├── Reports/                  ← Test / BDD reports  
├── src/test/java/            ← Test code written in BDD style  
├── target/                   ← Build output (compiled, reports, etc.)  
├── test-output/              ← Raw test output logs  
├── .classpath                ← IDE config  
├── .project                  ← IDE config  
├── pom.xml                   ← Maven build file  

Getting Started
Prerequisites

Java JDK (version compatible, e.g. Java 8 or higher)

Maven

IDE (Eclipse / IntelliJ / VSCode etc.) if you want to import and edit code

Setup

Clone the repo:

git clone https://github.com/abhay-1994/BDDLearning.git
cd BDDLearning


Ensure dependencies are downloaded via Maven:

mvn clean install


Open in your IDE if needed.

Running Tests

To run all tests:

mvn test


To generate reports:

mvn test
# Reports are found in Reports/ or target folder depending on config

Reporting

Test output / logs are stored in test-output/.

Generated BDD/acceptance style reports are in Reports/.

Build artifacts are in target/.

How to Contribute

Fork the repository.

Make your changes in a new branch.

Ensure tests are passing.

Submit a pull request explaining what you’ve added/changed.



Contact

For questions or issues, reach out to abhay-1994 via GitHub or email.
