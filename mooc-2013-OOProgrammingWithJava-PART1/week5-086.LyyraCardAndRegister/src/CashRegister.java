
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    //private double change;
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_OF_GOURMET = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000.00;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven == PRICE_OF_ECONOMICAL) {
            this.cashInRegister += cashGiven;
            economicalSold++;
        } else if (cashGiven > PRICE_OF_ECONOMICAL) {
            this.cashInRegister += PRICE_OF_ECONOMICAL;
            economicalSold++;
        } else if (cashGiven < PRICE_OF_ECONOMICAL) {
            cashGiven += 0;
        }
        return cashGiven - (economicalSold * PRICE_OF_ECONOMICAL);
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven == PRICE_OF_GOURMET) {
            this.cashInRegister += cashGiven;
            gourmetSold++;
        } else if (cashGiven > PRICE_OF_GOURMET) {
            this.cashInRegister += PRICE_OF_GOURMET;
            gourmetSold++;
        } else if (cashGiven < PRICE_OF_GOURMET) {
            cashGiven += 0;
        }
        return cashGiven - (gourmetSold * PRICE_OF_GOURMET);
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= PRICE_OF_ECONOMICAL) {
            card.pay(PRICE_OF_ECONOMICAL);
            //this.cashInRegister += PRICE_OF_ECONOMICAL;
            economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= PRICE_OF_GOURMET) {
            card.pay(PRICE_OF_GOURMET);
            gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum < 0) {
            card.loadMoney(0);
        } else {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
