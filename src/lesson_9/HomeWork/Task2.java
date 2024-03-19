package lesson_9.HomeWork;


import java.util.Arrays;
import java.util.Random;

/*
Допустим дан массив чисел.

Написать метод, который в этом массиве меняет местами элемент с индексом index1 и элемент с индексом index2.
Написать метод, который возвращает индекс самого маленького числа в этом массиве.
Написать метод, который возвращает индекс самого маленького числа в этом массиве,
 но при этом поиск осуществляется только в части массива, заданной параметрами startIndex и endIndex.
 */
public class Task2 {

    public static void replaceByIndex(int [] randomArray, int index1, int index2){

            if (index1 >= 0 && index1 < randomArray.length && index2 >= 0 && index2 <= randomArray.length){
                int temp = randomArray[index1];
                randomArray[index1] = randomArray[index2];
                randomArray[index2] = temp;
            }else{
                System.out.println("No correct index!");
            }
        }

    public static int minIndexOfMinValue (int[]randomArray){
        int minIndex = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < randomArray[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int indexOf(int[] randomArray,int startIndex, int endIndex){
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < endIndex ; i++) {
            if (randomArray[i] < randomArray[minIndex]){
                minIndex = i;
            }
        }

        return minIndex;
    }


    public static void sort(int[]randomArray){
        for (int i = 0; i < randomArray.length; i++) {
            int minIndex = indexOf(randomArray,i, randomArray.length);
            indexOf(randomArray,i, minIndex);
        }
    }



    public static void main(String[] args) {
        int[] randomArray = {1,2,3,4,5,6,7,8,9,0,100,345,65,42,766,12,546,2,4,34};

        System.out.println(Arrays.toString(randomArray));

        replaceByIndex(randomArray,0,4);
        System.out.println(Arrays.toString(randomArray));

        System.out.println(minIndexOfMinValue(randomArray));

        System.out.println(indexOf(randomArray, 0, 10));

        sort(randomArray);
        System.out.println(Arrays.toString(randomArray));

    }
}
