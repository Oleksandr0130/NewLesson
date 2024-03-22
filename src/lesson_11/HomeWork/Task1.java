package lesson_11.HomeWork;


import java.util.Arrays;

/*
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
 */
public class Task1 {

    public static void printArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print("[ " + array[i] + " ]");

        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};
        System.out.println(Arrays.toString(array));
        printArray(array);
    }
}
