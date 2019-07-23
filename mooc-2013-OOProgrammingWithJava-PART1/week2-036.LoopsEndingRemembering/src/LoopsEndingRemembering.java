
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // System.out.println("Type numbers: ");
        int number = 0;
        int result = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;

        System.out.print("Type numbers: ");
        number = Integer.parseInt(reader.nextLine());
        while (number != -1) {
            result += number;

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            counter++;
            System.out.print("Type numbers: ");
            number = Integer.parseInt(reader.nextLine());
        }

        double average = (double) result / counter;

        System.out.println("Thank you and see you later");
        System.out.println("The sum is " + result);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
