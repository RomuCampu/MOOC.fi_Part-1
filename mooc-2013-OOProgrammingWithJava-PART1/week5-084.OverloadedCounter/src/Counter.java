
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.startingValue;
    }

    public void increase() {
        this.startingValue++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.startingValue += increaseAmount;
        }
    }

    public void decrease() {
        if (this.check == true && this.startingValue > 0) {
            this.decrease(1);
        } else if (this.check == false) {
            this.decrease(1);
        } else if (this.startingValue < 0) {
            this.startingValue = 0;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check == false) {
                this.startingValue -= decreaseAmount;
            }
            if (check == true && this.startingValue == 0) {
                this.startingValue = 0;
            }
            if (check == true && this.startingValue > 0) {
                this.startingValue -= decreaseAmount;
                if (this.startingValue < 0) {
                    this.startingValue = 0;
                }
            }
        }
    }
}
