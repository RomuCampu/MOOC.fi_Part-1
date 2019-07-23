
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        int counter = 0;
        
        while(number > counter) {
            counter++;
            System.out.println(counter);
        }
    }
}
