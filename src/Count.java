import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner userInputScan = new Scanner(System.in);

        int postiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;

        while (true) {

            System.out.println("Please enter an integer and when you've had enough type 'exit'.");
            String userInputString = userInputScan.nextLine();

            if (userInputString.equals("exit")) {
                break;
            }

            int userInputNum = Integer.parseInt(userInputString);

            if (userInputNum > 0) {
                postiveCount++;
            }

            else if (userInputNum < 0) {
                negativeCount++;
            }

            else {
                zerosCount++;
            }

        }

        String numberPos = postiveCount == 1 ? "number" : "numbers";
        String numberNeg = negativeCount == 1 ? "number" : "numbers";
        String numberZero = zerosCount == 1 ? "zero" : "zeros";

        System.out.printf("You chose %d positive %s.%n", postiveCount, numberPos);
        System.out.printf("You chose %d negative %s.%n", negativeCount, numberNeg);
        System.out.printf("You chose %d %s.%n", zerosCount, numberZero);

    }
}
