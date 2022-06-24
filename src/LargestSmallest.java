import java.util.Scanner;

public class LargestSmallest {

    public static void main(String[] args) {
        Scanner userInputScan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Please enter an integer and when you've had enough type 'exit'.");
            String userInputString = userInputScan.nextLine();

            if (userInputString.equals("exit")) {
                break;
            }

            int userInputNum = Integer.parseInt(userInputString);

            if (userInputNum < min) {
                min = userInputNum;
            }

            if (userInputNum > max) {
                max = userInputNum;
            }

        }

        System.out.printf("The lowest number you entered was %d%n", min);
        System.out.printf("The highest number you entered was %d%n", max);

    }
}
