
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Type a word: ");
        String input = reader.nextLine();
        words.add(input);

        while (!input.isEmpty()) {
            System.out.print("Type a word: ");
            input = reader.nextLine();
            words.add(input);

            if (input.isEmpty()) {
                break;
            }
        }
        Collections.reverse(words);

        for (String word : words) {
            System.out.println(word);

        }
    }
}
