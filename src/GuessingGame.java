import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(100) + 1;
        int userGuessNum;

        do {
            String userGuessStr = System.console().readLine("Please guess a number between 1-100 (inclusive):%n");
            userGuessNum = Integer.parseInt(userGuessStr);
                if (userGuessNum > randomNumber) {
                    System.out.println("Too high, try again.");
                } else if (userGuessNum < randomNumber) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.printf("Well done, you got it.%nGame over!%n");
                }
        } while (userGuessNum != randomNumber);


    }
}
