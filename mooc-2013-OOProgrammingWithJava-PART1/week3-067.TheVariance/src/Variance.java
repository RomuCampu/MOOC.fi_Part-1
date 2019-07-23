
import java.util.ArrayList;

public class Variance {

    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int num : list) {
            total += num;
        }
        return total;
    }
    
    public static double average(ArrayList<Integer> list) {
        double counter = 0;
        for (int count : list) {
            counter++;
        }
        return sum(list) / counter;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
