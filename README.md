# UI Test Framework using Cucumber, Java, and Selenium

This project is aims to automated UI testing for web applications using Selenium and Cucumber Testing.

- API automation task : https://www.saucedemo.com/

## Getting Started

These instructions will guide you on how to set up the project on your local machine for development and testing purposes.
### Prerequisites

Before getting started, ensure that you have the following software installed on your machine:
```
1. Java JDK: You can download and install the latest version of Java JDK from the official Oracle website.
2. Gradle: Gradle is used as the build tool for this project. Install Gradle on your machine by following the official Gradle installation guide.```
```

### Installing

To set up the development environment, follow these steps:
1. Clone this repository to your local machine using Git or download the ZIP file and extract it.
2. Open the project in your preferred Java IDE (e.g., IntelliJ or Eclipse).
3. Build the project and download dependencies using Gradle by running the following command in the terminal:

```
gradle build

```

## Running the tests

To execute the automated tests for this system, run the following Gradle task:

```
gradle cucumber

```
This will run the Cucumber tests with the specified configuration and generate an HTML test report in the "reports" directory.


## Built With

* Selenium: The web automation library used for interacting with web elements and performing actions on web pages.
* Cucumber: A BDD testing framework that allows tests to be written in a natural language format (Gherkin) and executed using step definitions written in Java.
* Gradle: The build tool used for managing dependencies and building the project.

## Screenshoot Running Test

https://github.com/AdrianHart/PR19Module21/blob/main/Running%20Test%20PR%2019%20Module%2021.PNG

## Intro CI/CD Pipelines

Continuous Integration (CI) and Continuous Delivery (CD) are the Holy Grail for software development teams: no matter who pushes the feature, the same tests are run, the same processes are followed, and nothing gets released without satisfying well-defined quality standards.
Unfortunately, setting up that initial CI/CD workflow can be a bit daunting for teams that don’t have an experienced DevOps engineer.

## Screenshoot CI/CD Pipeline Test

1. https://github.com/AdrianHart/PR19Module21/blob/main/Running%20Pipeline%20Workflow%201.PNG
2. https://github.com/AdrianHart/PR19Module21/blob/main/Running%20Pipeline%20Workflow%202.PNG



