
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        LyyraCard cardPekka = new LyyraCard(20.0);
        LyyraCard cardBrian = new LyyraCard(30.0);
        
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.loadMoney(20.0);
        cardBrian.payGourmet();
        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50.0);
        
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}
