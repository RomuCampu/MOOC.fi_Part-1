
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int i = name.length() - 1;
        System.out.print(name.charAt(i));

        while (i != 0) {
            i--;
            System.out.print(name.charAt(i));

        }

    }
}
