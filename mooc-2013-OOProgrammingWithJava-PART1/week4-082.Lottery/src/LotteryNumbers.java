
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        
        this.numbers = new ArrayList<Integer>();
        
        random = new Random();
        int drawNumber;
        while (this.numbers.size() < 7) {
            drawNumber = this.random.nextInt(40);
            if (drawNumber > 0 && !containsNumber(drawNumber)) {
                this.numbers.add(drawNumber);
            }
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);

    }
}
