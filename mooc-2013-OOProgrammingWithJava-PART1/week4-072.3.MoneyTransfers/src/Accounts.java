
public class Accounts {

    public static void main(String[] args) {
        
        Account firstAccount = new Account("A", 100.0);
        Account secondAccount = new Account("B", 0.0);
        Account thirdAccount = new Account("C", 0.0);

        transfer(firstAccount, secondAccount, 50.0);
        transfer(secondAccount, thirdAccount, 25.0);

        System.out.println(firstAccount);
        System.out.println(secondAccount);
        System.out.println(thirdAccount);
    }

    public static void transfer(Account from, Account to, double howMuch) {

        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
