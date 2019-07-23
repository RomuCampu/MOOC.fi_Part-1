
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        // program your solution here. Do not touch the above lines
        System.out.print("Guess a number: ");
        int numberGuessed = Integer.parseInt(reader.nextLine());
        int numberOfGuesses = 0;

        while (numberGuessed != numberDrawn) {
            if (numberDrawn == numberGuessed) {
                break;
            } else if (numberGuessed > numberDrawn) {
                numberOfGuesses++;
                System.out.println("The number is lesser, guess made: " + numberOfGuesses);
                System.out.print("Guess a number: ");
                numberGuessed = Integer.parseInt(reader.nextLine());
            } else if (numberGuessed < numberDrawn) {
                numberOfGuesses++;
                System.out.println("The number is greater, number guessed: " + numberOfGuesses);
                System.out.print("Guess a number: ");
                numberGuessed = Integer.parseInt(reader.nextLine());
            }
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
