import java.util.Scanner;

public class FractionSeries {

//    Write a program to calculate the sum of following series where n is input by user.
//            1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

    public static void main(String[] args) {
        Scanner userInputScan = new Scanner(System.in);
        System.out.println("Please enter a positive integer.");
        String userInputString = userInputScan.nextLine();

        int userInputNum = Integer.parseInt(userInputString); //this is n

        double sum = 0;

        for (int x = 1; x <= userInputNum; x++) {
           sum += 1f/x; // same as: sum = sum + (1f/x)
        }
            System.out.printf("The sum is: %f%n", sum);
        }


}

