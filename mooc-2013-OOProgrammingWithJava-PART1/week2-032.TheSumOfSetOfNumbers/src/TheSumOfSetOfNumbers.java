
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int result = Integer.parseInt(reader.nextLine());
        int counter = 0;
        int tester = 0;
        while(counter < result) {
            counter++;
            tester += counter;
        }
        System.out.println("Sum is " + tester);
    }
}
