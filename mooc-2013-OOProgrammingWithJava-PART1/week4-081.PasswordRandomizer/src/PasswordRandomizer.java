import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int length;
    private int number;

    public PasswordRandomizer(int length) {
        this.random = new Random();
        this.length = length;
        
    }

    public String createPassword() {
        
        String password = "";
        number = 0;
        
        for(int i = 0; i < this.length; i++) {
            number = this.random.nextInt(25);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password += symbol;
        }
        return password;
    }
}
