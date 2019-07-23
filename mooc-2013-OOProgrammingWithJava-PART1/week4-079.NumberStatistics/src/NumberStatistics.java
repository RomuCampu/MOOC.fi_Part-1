
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;  //Integer.MIN_VALUE;
        //System.out.println(amountOfNumbers + " hey");
    }

    public void addNumber(int number) {
        sum += number;
        //System.out.println(number);
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        //System.out.println(amountOfNumbers + " hi");
        return this.amountOfNumbers;
    }

    public int sum() {
        //System.out.println(this.sum + " hello");
        return this.sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        }
        return (double) sum / amountOfNumbers;
    }
}
