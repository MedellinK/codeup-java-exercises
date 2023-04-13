import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
//            System.out.println(i);
            i++;
        }

//        int j = 100;
//        do {
////            System.out.println(j);
//            j = j - 5;
//        } while (j >= -10);

        for (int j = 100;j >= -10; j = j - 5) {
//            System.out.println(j);
        }

//        long k = 2;
//        do {
////            System.out.println(k);
//            k = k * k;
//        } while (k < 1000000);

        for (long k = 2; k < 1000000; k = k * k) {
//            System.out.println(k);
        }

//        // FizzBuzz
//        for (int l = 1; l <= 100; l++) {
//            if (l % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (l % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (l % 3 == 0 && l % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(l);
//            }
//        }

        // Table of Powers
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int userInput = sc.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int m = 1; m <= userInput; m++) {
            System.out.println(m + "      | " + (m * m) + "       | " + (m * m * m));
        }


        // Convert Number grades into letter grades.
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a grade from 0 to 100: ");
        int userGrade = sc.nextInt();
        do {
            if (userGrade < 0 || userGrade > 100) {
                System.out.println("Please enter a valid grade from 0 to 100: ");
                userGrade = sc.nextInt();
            } else if (userGrade >= 99) {
                System.out.println("A+");
            } else if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to enter another grade? [y/n]");
            String userResponse = sc.next();
            if (userResponse.equalsIgnoreCase("y")) {
                System.out.println("Please enter a numerical grade from 0 to 100: ");
                userGrade = sc.nextInt();
            } else {
                System.out.println("Later Foo");
                break;
            }
        } while (userGrade >= 0 && userGrade <= 100);

    }
}
