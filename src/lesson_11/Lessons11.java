package lesson_11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lessons11 {
    public static void main(String[] args) {
//        int[] array = {6,4,9,-1,7,4};
        int[]array = createIntArray(20, -20, 10);
//        int[] array = inputArray();
        print(array);
//        sort(array);
        bubbleSort(array);
        print(array);
        swap(array, 1, 4);
//        System.out.println(Arrays.binarySearch(array, 4));
        System.out.println(binarySearch(array, 10));
        System.out.println("=============================");

        String[] array1 = {"Jack", "Lena", "Anna", "Nikolaj"};
        print(array1);
        sort(array1);
        print(array1);


    }

    public static int binarySearch(int[] array, int searchValue){
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;


        while (startIndex <= endIndex){

            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex]== searchValue){
                return  middleIndex;
            }
            if (array[middleIndex] > searchValue){
                endIndex = middleIndex -1;
            }else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] array) {

        boolean isSwap = true;

        while (isSwap) {
            isSwap = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    isSwap = true;
                    swap(array, i, i - 1);
                }
            }
        }
    }

    public static int[] createIntArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//            array[i] = random.nextInt(100);
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

//    public static int[] inputArray() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input length array -> ");
//        int size = scanner.nextInt();
//
//        int[] array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(" Input [" + i + "] value -> ");
//            array[i] = scanner.nextInt();
//        }
//        System.out.println("----------------------");
//        print(array);
//        System.out.println("----------------------");
//        return array;
//    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]:" + array[i] + "   ");
        }
        System.out.println();
    }

    public static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]:" + array[i] + "   ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int index1, int index2) {
        if (index1 >= 0 && index2 >= 0 && index1 < array.length && index2 < array.length) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static void swap(String[] array, int index1, int index2) {
        if (index1 >= 0 && index2 >= 0 && index1 < array.length && index2 < array.length) {
            String temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }


    public static int indexOfMin(int[] array, int indexStart, int indexEnd) {
        int indexMin = indexStart;
        for (int j = indexStart; j < array.length && j < indexEnd; j++) {
            if (array[j] < array[indexMin]) {
                indexMin = j;
            }
        }
        return indexMin;

    }

    public static int indexOfMin(String[] array, int indexStart, int indexEnd) {
        int indexMin = indexStart;
        for (int j = indexStart; j < array.length && j < indexEnd; j++) {
            // if(array[j].charAt(0) < array[indexMin].charAt(0)){
            if (array[j].compareTo(array[indexMin]) < 0) {
                indexMin = j;
            }
        }
        return indexMin;

    }


    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexMin = indexOfMin(array, i, array.length);
            swap(array, i, indexMin);
        }

    }

    public static void sort(String[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexMin = indexOfMin(array, i, array.length);
            swap(array, i, indexMin);
        }

    }
}
