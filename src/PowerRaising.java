import java.lang.Double;

public class PowerRaising {

    public static void main(String[] args) {
        String userInput1Str = System.console().readLine("Please enter a positive integer (max 15):%n");
        double userInput1Num = Double.parseDouble(userInput1Str);

        String userInput2Str = System.console().readLine("Please enter another positive integer (max 15):%n");
        double userInput2Num = Double.parseDouble(userInput2Str);

        double poweredNumber = Math.pow(userInput1Num, userInput2Num);

        System.out.printf("%d to the power of %d is %,d.%n", Math.round(userInput1Num), Math.round(userInput2Num), Math.round(poweredNumber));

    }
}
