import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String userInput = scanner.next();
        String userInputT = scanner.next();

        System.out.println("Hello " + userInput + " " + userInputT);
        System.out.printf("Hello %s %s", userInput,userInputT);

    }
}
