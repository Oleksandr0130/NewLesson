package lesson_10.HomeWork;

import java.util.Arrays;

public class Task1 {

    public static int maxIndex(int[] array, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = maxIndex(array, i, array.length - 1);

            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 6, 9, 7, 0, 4, 8, 1, 5,-1,-3,-5,-6,-8,-9,-2};

        System.out.println(Arrays.toString(array));

        sortArray(array);
        System.out.println(Arrays.toString(array));
    }
}
