#  Volume Calculation Test Project

This project demonstrates the use of **unit testing in Java** to validate mathematical functions that calculate the volume of three different 3D shapes: cube, rectangular prism (cuboid), and sphere.

It is part of a QA course final project, focused on writing unit tests using **JUnit 5** and reading test data from a **CSV file** for parameterized testing.

---

##  Project Objectives

- Create mathematical functions to calculate:
  - Cube volume (`side³`)
  - Rectangular prism volume (`width × height × length`)
  - Sphere volume (`(4/3) × π × radius³`)
- Write unit tests for each function
- Use a **CSV file** as a data source for testing the sphere volume
- Demonstrate test execution using **JUnit 5** and **Maven**

---

##  Key Features

- Developed in **Java 17**
- Unit tests created using **JUnit 5**
- Parameterized tests using loop and CSV file reading
- Mathematical validation of shape volumes
- Modular and clear test structure for learning and demonstration

---

## Project Structure

volume-test/
├── pom.xml                         
├── massa_esfera.csv     # CSV file with test data for sphere volume
└── src/
    ├── main/
    │   └── java/
    │       └── com/seuprojeto/volumes/
    │           └── CalculadoraVolume.java
    └── test/
        └── java/
            └── com/seuprojeto/volumes/
                └── CalculadoraVolumeTest.java


## 🛠 Technologies Used

| Technology     | Version       |
|----------------|----------------|
| Java           | 17             |
| Maven          | 3.8+           |
| JUnit          | 5.10.0         |
| OpenCSV        | 5.8            |

---

## 🚀 How to Run the Tests

1. Clone or download this repository.
2. Open it in your IDE (e.g., VS Code or IntelliJ).
3. Ensure **Java 17** and **Maven** are installed and configured.
4. Run the tests using the command:

```bash
mvn test

Sample Test Output

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS

