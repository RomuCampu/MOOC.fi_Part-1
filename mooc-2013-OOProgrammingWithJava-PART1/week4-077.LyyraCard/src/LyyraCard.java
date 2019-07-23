
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance = balance - 4.00;
        }
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance = balance - 2.50;
        }
    }

    public void loadMoney(double amount) {
        if (amount <= 0) {
            amount = 0;
        }
        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        }

    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}
