
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int thisValueEuros = this.euros + added.euros;
        int thisValueCents = this.cents + added.cents;
        return new Money(thisValueEuros, thisValueCents);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decremented) {

        int thisValueEuros;
        int thisValueCents;

        if (this.less(decremented)) {
            thisValueEuros = 0;
            thisValueCents = 0;
        } else {
            thisValueEuros = this.euros - decremented.euros;
            thisValueCents = this.cents - decremented.cents;
            
            if(this.cents < decremented.cents) {
                thisValueEuros--;
                thisValueCents = 100 - decremented.cents;
            }
        }

        return new Money(thisValueEuros, thisValueCents);
    }

}
