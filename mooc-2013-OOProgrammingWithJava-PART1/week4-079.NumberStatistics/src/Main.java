
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics evenNumbers = new NumberStatistics();
        NumberStatistics oddNumbers = new NumberStatistics();

        System.out.println("Type numbers: ");

        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            }

            sum.addNumber(input);

            if (input % 2 == 0) {
                evenNumbers.addNumber(input);
            }
            if (input % 2 != 0) {
                oddNumbers.addNumber(input);
            }
        }
        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + evenNumbers.sum());
        System.out.println("sum of odd: " + oddNumbers.sum());
    }
}
