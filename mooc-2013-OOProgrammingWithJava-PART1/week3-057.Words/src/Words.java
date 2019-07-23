
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String myWords = reader.nextLine();
        words.add(myWords);

        while (!words.isEmpty()) {
            System.out.println("Type a word: ");
            myWords = reader.nextLine();
            words.add(myWords);

            if (myWords.isEmpty()) {
                break;
            }
        }

        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
