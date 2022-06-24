import java.util.Scanner;

public class SumTwoNumbersRepeat {

    public static void main(String[] args) {

        String goAgain;

        do {

            Scanner userInputScan = new Scanner(System.in);
            System.out.println("Please enter a positive integer.");
            String userInput1String = userInputScan.nextLine();
            int userInput1Num = Integer.parseInt(userInput1String);

            System.out.println("Please enter another integer:%n");
            String userInput2String = userInputScan.nextLine();
            int userInput2Num = Integer.parseInt(userInput2String);

            int sumOfInputs = userInput1Num + userInput2Num;
            System.out.printf("%d + %d is %d.%n", userInput1Num, userInput2Num, sumOfInputs);

            System.out.println("Would you like another go? (y/n)");
            goAgain = userInputScan.nextLine();

        } while (!goAgain.equals("n"));
    }

}
