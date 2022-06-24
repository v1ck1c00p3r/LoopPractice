public class FactorialValue {

    public static void main(String[] args) {
        String userInputStr = System.console().readLine("Please enter a positive integer:%n");
        int userInputNum = Integer.parseInt(userInputStr);
        long factorial = 1;

        for (int x = 1; x <= userInputNum; x++) {
            factorial = factorial * x;
        }

        System.out.printf("The factorial value of %d is %d%n", userInputNum, factorial);

    }
}
