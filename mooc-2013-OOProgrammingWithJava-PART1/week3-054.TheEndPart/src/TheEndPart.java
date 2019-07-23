
import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of the end part: ");
        int lengthOfTheEndPart = Integer.parseInt(reader.nextLine());
        String endParts = word.substring(word.length() - lengthOfTheEndPart);

        System.out.println("Result: " + endParts);
    }
}
