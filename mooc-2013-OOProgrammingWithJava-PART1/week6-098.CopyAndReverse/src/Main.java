
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {

        int amountOfItems = array.length;
        int[] copied = new int[amountOfItems];

        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int amountOfItems = array.length;
        int[] reversedArray = new int[amountOfItems];

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[i] = array[array.length -i -1];
        }
        return reversedArray;
    }

}
