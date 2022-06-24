public class FancyAnotherGo {

    public static void main(String[] args) {

        String goAgain;

        do {

            String userInput1Str = System.console().readLine("Please enter an integer:%n");
            int userInput1Num = Integer.parseInt(userInput1Str);

            String userInput2Str = System.console().readLine("Please enter another integer:%n");
            int userInput2Num = Integer.parseInt(userInput2Str);

            int sumOfInputs = userInput1Num + userInput2Num;
            System.out.printf("%d + %d is %d.%n", userInput1Num, userInput2Num, sumOfInputs);

            System.out.println("Would you like another go? (y/n)");
            goAgain = System.console().readLine();

        } while (!goAgain.equals("n"));
    }

}
