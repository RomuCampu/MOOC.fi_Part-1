
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String user1 = "alex";
        String passwordA = "mightyducks";
        
        String user2 = "emily";
        String passwordB = "cat";
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        
        if((name.equals(user1) && password.equals(passwordA)) || (name.equals(user2) && password.equals(passwordB))) {
            System.out.println("You are now logged into the system!");
        }
        else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
