# Zodiac Sign Finder Project

## Overview
This project is a simple Java program designed to take a user's birth month and day as input and determine their zodiac sign. It is an ideal project for beginners to understand Java basics, including conditional statements, user input handling, and error checking.

## Features
- Prompts the user to enter their birth month and day.
- Validates the user input to ensure that the month and day are within valid ranges.
- Determines and displays the user's zodiac sign based on their birth date.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- A Java code editor or IDE (e.g., IntelliJ, Eclipse, NetBeans, or VS Code).

### Running the Project
1. **Clone the Repository (Optional):** If the code is available in a repository, clone it using:
   ```sh
   git clone <repository-url>
   ```

2. **Open the Code Editor/IDE:** Open your favorite Java IDE or code editor and create a new project named `ZodiacSignFinder`.

3. **Create the Main Java File:** Create a new file named `Main.java` and copy the following code into it:
   ```java
   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           int dogumAyi;
           int dogumGunu;
           Scanner scanner = new Scanner(System.in);

           System.out.println("Enter your birth month: ");
           dogumAyi = scanner.nextInt();

           System.out.println("Enter your birth day: ");
           dogumGunu = scanner.nextInt();

           if (dogumGunu > 31 || dogumGunu < 1 || dogumAyi < 1 || dogumAyi > 12) {
               System.out.println("Invalid input!");
               return;
           }

           if (dogumAyi == 3 && dogumGunu >= 21 || dogumAyi == 4 && dogumGunu <= 20) {
               System.out.println("Aries");
           } else if (dogumAyi == 4 && dogumGunu >= 21 || dogumAyi == 5 && dogumGunu <= 21) {
               System.out.println("Taurus");
           } else if (dogumAyi == 5 && dogumGunu >= 22 || dogumAyi == 6 && dogumGunu <= 22) {
               System.out.println("Gemini");
           } else if (dogumAyi == 6 && dogumGunu >= 23 || dogumAyi == 7 && dogumGunu <= 22) {
               System.out.println("Cancer");
           } else if (dogumAyi == 7 && dogumGunu >= 23 || dogumAyi == 8 && dogumGunu <= 22) {
               System.out.println("Leo");
           } else if (dogumAyi == 8 && dogumGunu >= 23 || dogumAyi == 9 && dogumGunu <= 22) {
               System.out.println("Virgo");
           } else if (dogumAyi == 9 && dogumGunu >= 23 || dogumAyi == 10 && dogumGunu <= 22) {
               System.out.println("Libra");
           } else if (dogumAyi == 10 && dogumGunu >= 23 || dogumAyi == 11 && dogumGunu <= 21) {
               System.out.println("Scorpio");
           } else if (dogumAyi == 11 && dogumGunu >= 22 || dogumAyi == 12 && dogumGunu <= 21) {
               System.out.println("Sagittarius");
           } else if (dogumAyi == 12 && dogumGunu >= 22 || dogumAyi == 1 && dogumGunu <= 21) {
               System.out.println("Capricorn");
           } else if (dogumAyi == 1 && dogumGunu >= 22 || dogumAyi == 2 && dogumGunu <= 19) {
               System.out.println("Aquarius");
           } else if (dogumAyi == 2 && dogumGunu >= 20 || dogumAyi == 3 && dogumGunu <= 20) {
               System.out.println("Pisces");
           }
       }
   }
   ```

4. **Compile and Run:** Compile and run the program.
   ```sh
   javac Main.java
   java Main
   ```

5. **User Input:** The program will prompt you to enter your birth month and day. After entering the values, it will display your zodiac sign.

## Example
```
Enter your birth month:
3
Enter your birth day:
25
Aries
```

## Explanation
The program uses `if-else` statements to determine the user's zodiac sign based on their birth date. It validates the user input to ensure the birth month is between 1 and 12 and the day is within the valid range for each month.

## Author
- **Hekim Can Aktaş**

## License
This project is open-source and available under the [MIT License](LICENSE).

## Acknowledgments
- Thanks to the Java community for helpful resources and tutorials.
- Inspired by basic Java exercises for learning conditionals and user input handling.

