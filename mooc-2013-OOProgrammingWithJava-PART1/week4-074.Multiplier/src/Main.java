
public class Main {
    
    public static void main(String[] args) {
        // This is an empty main method which you can use to test your class's functionality.
        Multiplier timesThree = new Multiplier(3);
        
        System.out.println(timesThree.multiply(9));
        
        Multiplier timesTen = new Multiplier(10);
        System.out.println(timesTen.multiply(10));
    }
}
