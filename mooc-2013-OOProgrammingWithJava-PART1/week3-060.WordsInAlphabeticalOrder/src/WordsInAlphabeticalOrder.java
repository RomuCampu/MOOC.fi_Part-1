
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> wordList = new ArrayList<String>();

        System.out.print("Type a word: ");
        String userInput = reader.nextLine();
        wordList.add(userInput);

        while (!userInput.isEmpty()) {
            System.out.print("Type a word: ");
            userInput = reader.nextLine();
            wordList.add(userInput);

            if (userInput.isEmpty()) {
                break;
            }
        }
        Collections.sort(wordList);
        System.out.println("You typed the following words: ");
        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
