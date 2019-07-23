
import java.util.Scanner;

public class LengthOfName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String input = reader.nextLine();
        System.out.print("Number of characters: ");
        System.out.println(calculateCharacters(input));

        // call your method from here
    }

    // do here the method
    // 
    public static int calculateCharacters(String text) {
        return text.length();
    }

}
