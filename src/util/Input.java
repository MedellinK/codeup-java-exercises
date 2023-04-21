package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Continue? [y/n]: ");

        scanner = new Scanner(System.in);
        if (this.scanner.nextLine().equalsIgnoreCase("y") || this.scanner.nextLine().equalsIgnoreCase("yes")) {
            return true;
        } else {
            System.out.println("Goodbye!");
            return false;
        }
    }

    public int getInt() {
        try {
            System.out.println("Please enter an integer: ");
            String userInput = getString();
            int number = Integer.valueOf(userInput);
            System.out.println("Your number is " + number);
            return number;
        } catch (NumberFormatException e){
            System.out.println("Oops!, try again");
            System.out.println(e);
            return getInt();
        }
    }

    double getDouble(double min, double max) {
        System.out.printf("Please enter a number between %.2f and %.2f: ", min, max);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            System.out.printf("Invalid input. Please enter a number between %.2f and %.2f.", min, max);
            return getDouble(min, max);
        } else {
            System.out.println("You entered: " + userInput);
            return userInput;

        }
    }

    public double getDouble(String s) {
        return 0;
    }

}
