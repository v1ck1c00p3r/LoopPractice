import java.util.Scanner;

public class Prime {

    private static boolean isPrime(int number) {
        for (int x = 2; x <= number/2; x++) {
            if (number % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner userInputScan = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter an integer and when you've had enough type 'exit'.");
            String userInputString = userInputScan.nextLine();

            if (userInputString.equals("exit")) {
                break;
            }

            int userInputNum = Integer.parseInt(userInputString);

            if (isPrime(userInputNum)){
                System.out.println("You chose a prime number");

            } else {
                System.out.println("You chose a non-prime number");
            }
        }
    }
}
