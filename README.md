# Secure Pay Coding Assignment

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b067af10e6bf4f1c821012059cc91322)](https://www.codacy.com/app/vjagannath09/securePay)

## Languages and Tools
- Java
- Gradle
- Selenium
- JUnit
- Truth

## Design Patterns Used
- Page Objects

## Linting
- google-java-format-gradle-plugin
- Used Codacy to monitor code health

Execute the task googleJavaFormat to format all *.java files in the project
 ./gradlew goJF

Execute the task verifyGoogleJavaFormat to verify that all *.java files are formatted properly
 ./gradlew verGJF

## Test Execution
- ./gradlew clean test --tests specs.SecurePaySpec.*

Reports could be seen in <PWD>/build/reports/tests/test/index.html

## Assumptions
- Expecting Java , Gradle & Chrome Browser to be pre-installed.
- Working environment is :  Mac OS

## Learning
- Use Chrome Options for Chrome Driver
- If use the Truth as your assertion framework, the test will error with NoSuchMethod Error
because of having two different versions of Guava. Solution , use the hamcrest matchers.