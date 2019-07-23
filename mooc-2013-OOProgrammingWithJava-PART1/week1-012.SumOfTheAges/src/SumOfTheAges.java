
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type you name: ");
        String name1 = reader.nextLine();
        System.out.print("Typer your age: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String name2 = reader.nextLine();
        System.out.print("Type your age: ");
        int b = Integer.parseInt(reader.nextLine());
        
        int sumOfAges = a + b;
        
        System.out.println(name1+" and "+name2+" are "+sumOfAges+" years old in total.");
        // Implement your program here
    }
}
