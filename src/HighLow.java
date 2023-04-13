import java.util.Scanner;
import java.lang.Math;


public class HighLow {

    public static void main(String[] args) {
    int random = randomNumber();
        highLow(random);

    }

    // Picks a random number between 1 and 100
    public static int randomNumber(){
        int ranNum = (int) (Math.random() * 100) + 1;
        return ranNum;
    }

    // Game Development Exercise
    public static int highLow(int randomNumber) {
        // Prompts user to guess the number
        System.out.println("Guess a number between 1 and 100: ");
        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();
        // Users inputs are validated
        if (userGuess < 1 || userGuess > 100) {
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
            highLow(randomNumber);
        } else {
            // Higher
            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
                highLow(randomNumber);
            // Lower
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
                highLow(randomNumber);
            // Guessed
            } else {
                System.out.println("GOOD GUESS!");
                return randomNumber;
            }
        }
        return randomNumber;
    }
}
