
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String input = reader.nextLine();

        int i;
        for (i = 0; i < input.length(); i++) {
            if (input.length() < 3) {
                break;
            } else {
                System.out.println("1. character: " + input.charAt(0));
                System.out.println("2. character: " + input.charAt(1));
                System.out.println("3. character: " + input.charAt(2));
                break;
            }
        }
    }
}
