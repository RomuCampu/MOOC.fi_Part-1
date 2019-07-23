
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        //int[] values = {4, 5, 8, 7, 11};
        //int[] values = {-1, 6, -3, 8, 12, 11};
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        //indexOfTheSmallestStartingFrom(values, 0);
         System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
//        System.out.println("smallest: " + smallest(values));
//
//       
//
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
//
//        //int[] values = {3, 2, 5, 4, 8};
//        System.out.println(Arrays.toString(values));
//
//        swap(values, 1, 0);
//        System.out.println(Arrays.toString(values));
//
//        swap(values, 0, 3);
//        System.out.println(Arrays.toString(values));

    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int temp = index;
        for (int i = index; i < array.length; i++) {
            if (array[temp] > array[i]) {
                temp = i;
            }
        }
        return temp;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        int temp2 = array[index2];

        array[index1] = temp2;
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
