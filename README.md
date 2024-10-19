# Zodiac Sign Finder Project

## Overview
This project is a simple Java program designed to determine the user's zodiac sign based on their birth month and day. The user is prompted to enter their birth month and day, and the program then calculates and displays their zodiac sign accordingly. This is a beginner-friendly project for learning how to use conditional statements and basic user input in Java.

## Features
- Prompts the user to enter their birth month and day.
- Validates the input to ensure the day and month are within valid ranges.
- Determines and displays the user's zodiac sign based on their input.

## Zodiac Signs and Date Ranges
- **Aries (Koç Burcu)**: March 21 - April 20
- **Taurus (Boğa Burcu)**: April 21 - May 21
- **Gemini (Ikizler Burcu)**: May 22 - June 22
- **Cancer (Yengeç Burcu)**: June 23 - July 22
- **Leo (Aslan Burcu)**: July 23 - August 22
- **Virgo (Başak Burcu)**: August 23 - September 22
- **Libra (Terazi Burcu)**: September 23 - October 22
- **Scorpio (Akrep Burcu)**: October 23 - November 21
- **Sagittarius (Yay Burcu)**: November 22 - December 21
- **Capricorn (Oğlak Burcu)**: December 22 - January 21
- **Aquarius (Kova Burcu)**: January 22 - February 19
- **Pisces (Balık Burcu)**: February 20 - March 20

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- A Java code editor or IDE (e.g., IntelliJ, Eclipse, NetBeans, or VS Code).

### Running the Project
1. **Clone the Repository (Optional):** If the code is in a repository, clone it using:
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
               System.out.println("Aries (Koç Burcu)");
           } else if (dogumAyi == 4 && dogumGunu >= 21 || dogumAyi == 5 && dogumGunu <= 21) {
               System.out.println("Taurus (Boğa Burcu)");
           } else if (dogumAyi == 5 && dogumGunu >= 22 || dogumAyi == 6 && dogumGunu <= 22) {
               System.out.println("Gemini (Ikizler Burcu)");
           } else if (dogumAyi == 6 && dogumGunu >= 23 || dogumAyi == 7 && dogumGunu <= 22) {
               System.out.println("Cancer (Yengeç Burcu)");
           } else if (dogumAyi == 7 && dogumGunu >= 23 || dogumAyi == 8 && dogumGunu <= 22) {
               System.out.println("Leo (Aslan Burcu)");
           } else if (dogumAyi == 8 && dogumGunu >= 23 || dogumAyi == 9 && dogumGunu <= 22) {
               System.out.println("Virgo (Başak Burcu)");
           } else if (dogumAyi == 9 && dogumGunu >= 23 || dogumAyi == 10 && dogumGunu <= 22) {
               System.out.println("Libra (Terazi Burcu)");
           } else if (dogumAyi == 10 && dogumGunu >= 23 || dogumAyi == 11 && dogumGunu <= 21) {
               System.out.println("Scorpio (Akrep Burcu)");
           } else if (dogumAyi == 11 && dogumGunu >= 22 || dogumAyi == 12 && dogumGunu <= 21) {
               System.out.println("Sagittarius (Yay Burcu)");
           } else if (dogumAyi == 12 && dogumGunu >= 22 || dogumAyi == 1 && dogumGunu <= 21) {
               System.out.println("Capricorn (Oğlak Burcu)");
           } else if (dogumAyi == 1 && dogumGunu >= 22 || dogumAyi == 2 && dogumGunu <= 19) {
               System.out.println("Aquarius (Kova Burcu)");
           } else if (dogumAyi == 2 && dogumGunu >= 20 || dogumAyi == 3 && dogumGunu <= 20) {
               System.out.println("Pisces (Balık Burcu)");
           }
       }
   }
   ```

4. **Compile and Run:** Compile and run the program.
   ```sh
   javac Main.java
   java Main
   ```

5. **User Input:** The program will prompt you to enter your birth month and day. Enter the values to get your zodiac sign.

## Example
```
Enter your birth month:
4
Enter your birth day:
25
Taurus (Boğa Burcu)
```

## Explanation
The program uses `if-else` statements to determine the zodiac sign based on the user's birth month and day. It also checks for invalid input values and provides a simple output message in case of errors.

## Author
- **Hekim Can Aktaş**

## License
This project is open-source and available under the [MIT License](LICENSE).

## Acknowledgments
- Thanks to the Java community for helpful resources and tutorials.
- Inspired by zodiac sign calculators for learning conditionals and input validation.

