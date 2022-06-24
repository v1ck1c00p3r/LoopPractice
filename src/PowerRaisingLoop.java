public class PowerRaisingLoop {

    public static void main(String[] args) {
        String userInput1Str = System.console().readLine("Please enter a positive integer (max 15):%n");
        int userInput1Num = Integer.parseInt(userInput1Str);

        String userInput2Str = System.console().readLine("Please enter another positive integer (max 15):%n");
        int userInput2Num = Integer.parseInt(userInput2Str);

        long poweredNumber = 1;

        for (int x = 1; x<= userInput2Num; x++) {
            poweredNumber = poweredNumber * userInput1Num;
        }

        System.out.printf("%d to the power of %d is %,d.%n", userInput1Num, userInput2Num, poweredNumber);
    }
}
