public class MultiplicationTable {

    public static void main(String[] args) {
        String userInputStr = System.console().readLine("Please enter a positive integer:%n");
        int userInputNum = Integer.parseInt(userInputStr);
        int x = 1;

        while (x <= 10) {
        System.out.printf("Your number (%d) multiplied by %d is: %d%n", userInputNum, x, userInputNum * x);
        x++;

        }

    }
}
