
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int factor = Integer.parseInt(reader.nextLine());

        int result = 1;
        int counter = 1;

        if (factor == 0) {
            factor += 1;
        }

        while (counter <= factor) {
            result *= counter;
            counter++;
        }
        System.out.println("Factorial is " + result);
    }
}
