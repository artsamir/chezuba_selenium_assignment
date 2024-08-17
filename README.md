# QA Test Automation Task(chezuba)

This project demonstrates how to use Selenium WebDriver with the Page Object Model (POM) pattern and Cucumber framework for testing a search functionality on a web page.

## Prerequisites

Before running the tests, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 17 or higher
- **Maven**: For dependency management
- **ChromeDriver**: For running tests on Chrome (or any other WebDriver for different browsers)

## Setup

1. **Clone the Repository**

   ```
   git clone https://github.com/artsamir/chezuba_selenium_assignment.git
   cd chezuba_selenium_assignment

2. **Install Dependencies** if not installed
   - Open a terminal and run the following command to install all necessary dependencies:
     ```
     mvn install
     ```

3. **Install chromebrowser and Configure WebDriver**
   - First download chromebrowser
   - Download the appropriate WebDriver for your browser and ensure it is in your system's path or set the path explicitly in your code.

4. **Run the test using Maven**
   - locate the download repository path
     ```
     Example:
     C:\Users\PC\Downloads\chezubaJavaAssignment\com.amazonSearch>
     ```
   - ```
     mvn test
     ```
     
     

## project Structure
<img width="255" alt="image" src="https://github.com/user-attachments/assets/d7ea11f7-0c07-4e21-99cd-1cc60586a3ea">

- `pageObjects` : Contains page object classes
  - `SearchPage.java`: element and methods are there

- `stepDefinition` : Contains step definition class
  - `SearchSteps.java`: @test case are there

- `runner` : Contains test runner class
  - `TestRunner.java`: cumcumber test run code there (feature file path and glue)

### .feature file
<img width="529" alt="image" src="https://github.com/user-attachments/assets/b5ac5f8a-ce13-4b2e-8199-be96d916d86d">

### SearchPage.java
<img width="534" alt="image" src="https://github.com/user-attachments/assets/994de7a7-c221-4d96-8cbd-9ba2aa0a816d">

### StepDefinition
<img width="605" alt="image" src="https://github.com/user-attachments/assets/82ee9a07-e27e-4fb3-b108-5493244f2930">

### TestRunner.java
<img width="478" alt="image" src="https://github.com/user-attachments/assets/3c25e5ff-1c80-4ab6-9ef3-95cdcd0a6143">


## Test Case result:
- All test case **Passed**
