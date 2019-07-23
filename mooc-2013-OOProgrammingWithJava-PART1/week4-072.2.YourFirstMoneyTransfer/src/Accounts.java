
public class Accounts {

    public static void main(String[] args) {

        Account secondAccount = new Account("Matt's account", 1000.0);
        Account thirdAccount = new Account("My account", 0);

        secondAccount.withdrawal(100.0);
        thirdAccount.deposit(100.0);

        System.out.println(secondAccount + "\n" + thirdAccount);

    }

}
