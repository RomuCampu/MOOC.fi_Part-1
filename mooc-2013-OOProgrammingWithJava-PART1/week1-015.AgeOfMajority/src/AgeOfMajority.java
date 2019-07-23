
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("how old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        if (age >= 18) {
            System.out.println("You have reacjed the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority!");
        }
        // Type your program here 
    }
}
