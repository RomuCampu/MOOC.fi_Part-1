import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type you name: ");
        String lastChar = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(lastChar));
    }
    
    public static char lastCharacter(String text) {
        return text.charAt(text.length() -1);
    }
}
