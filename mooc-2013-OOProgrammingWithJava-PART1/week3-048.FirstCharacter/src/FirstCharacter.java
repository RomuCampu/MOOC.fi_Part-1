import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String firstChar = reader.nextLine();
        
        System.out.print("First character: " + firstCharacter(firstChar));
    }
    
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }
}
