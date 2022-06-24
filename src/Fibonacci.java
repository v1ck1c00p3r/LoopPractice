public class Fibonacci {

    public static void main(String[] args) {

        String userInputStr = System.console().readLine("Please enter a value for n to find the Fibonacci sequence of that number:%n");
        int userInputNum = Integer.parseInt(userInputStr);

        int firstVariable = 0;
        int secondVariable = 1;

        int addBothNumbers;

        System.out.printf("The Fibonacci sequence for %d is: %n", userInputNum);

        for (int x = 0; x < userInputNum; x++) {
            System.out.printf("%d  ", firstVariable);
            addBothNumbers = firstVariable + secondVariable;

            firstVariable = secondVariable;
            secondVariable = addBothNumbers;

        }

    }
}

