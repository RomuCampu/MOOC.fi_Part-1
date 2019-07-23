
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        int result = 0;
        int i = 0;
        int calc = 2;
        while (i <= num) {
            result = result + (int) Math.pow(calc, i);
            i++;
        }
        System.out.println("The result is " + result);
    }
}
