
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        
        Account firstAccount  = new Account("firstAccount", 100.0);
        
        firstAccount.deposit(20.0);
        System.out.println(firstAccount);
    }
       
}
