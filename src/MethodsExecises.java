import java.util.Scanner;
//import java.util.Random;
import java.lang.Math;

public class MethodsExecises {

    public static void main(String[] args) {

//        System.out.println(validateInput(0,10));
//        System.out.println(calculateFactorial(5));
        System.out.println(rollDice(6));
    }

    // Basic Arithmetic
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    // Validates user input between min and max
    public static int validateInput(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between " + min + " and " + max + ": ");
        int userInput = sc.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
            return validateInput(min, max);
        } else {
            return userInput;
        }
    }

    // Calculates the factorial of a number
    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++){
            if (num < 1 || num > 10) {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
                return calculateFactorial(validateInput(1,10));
            } else {
                factorial = factorial * i;
            }
        }
        return factorial;
    }

    // Create an application that simulates dice rolling.
    public static int rollDice(int sides){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of sides for a pair of dice: ");
        sides = sc.nextInt();
        System.out.println("Press enter to roll the dice.");
        sc.nextLine();
        sc.nextLine();
        int dice1 = (int) Math.floor(Math.random() * sides);
        int dice2 = (int) Math.floor(Math.random() * sides);
        System.out.println("Dice 1: " + dice1 + " Dice 2: " + dice2);
        System.out.println("Would you like to roll again? [y/n]");
        String userResponse = sc.next();
        if (userResponse.equalsIgnoreCase("y")) {
            return rollDice(sides);
        } else {
            System.out.println("Later Foo");
            return 0;
        }
    }
}


