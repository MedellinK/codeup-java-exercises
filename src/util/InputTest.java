package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter a string:");
        String userInput = input.getString();
        System.out.println("You entered: " + userInput);

        input.yesNo();

        input.getDouble(1, 10);



    }
}
