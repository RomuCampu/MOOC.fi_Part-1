
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type  the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        double result = 2 * radius * Math.PI;
        
        System.out.println("Circumference of the circle: " + result);
        
        // Program your solution here 
    }
}
