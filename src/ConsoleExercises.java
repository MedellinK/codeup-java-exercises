import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        String userInputInteger = scanner.nextLine();
//        System.out.println("Your integer was: " + Integer.parseInt(userInputInteger));
//        int parsedUserInput = Integer.parseInt(userInputInteger);
//        System.out.println(parsedUserInput + parsedUserInput);


//          Scanner ThreeWords = new Scanner(System.in);
//        System.out.println("Please enter 3 words.");
//        String userWord1 = ThreeWords.next();
//        String userWord2 = ThreeWords.next();
//        String userWord3 = ThreeWords.next();
//        System.out.println(userWord1);
//        System.out.println(userWord2);
//        System.out.println(userWord3);


//        Scanner userSentence = new Scanner(System.in);
//        System.out.println("Please enter a sentence <3");
//        String userInputSentence = userSentence.nextLine();
//        System.out.println(userInputSentence);





        Scanner userClassroom = new Scanner(System.in);
//        userClassroom.useDelimiter("\n");
        System.out.println("Please enter the length of the classroom.");
        String userLength = userClassroom.next();
        System.out.println("Please enter the width of the classroom.");
        String userWidth = userClassroom.next();
        int userArea = Integer.parseInt(userLength) * Integer.parseInt(userWidth);
        int userPerimeter = (Integer.parseInt(userLength) * 2) + (Integer.parseInt(userWidth) * 2);
        System.out.println("The area of the classroom is: " + userArea);
        System.out.println("The perimeter of the classroom is: " + userPerimeter);
    }
}
