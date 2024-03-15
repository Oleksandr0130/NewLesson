package lesson_7.HomeWork;


import java.util.Scanner;

/*
Пусть дан массив, например такой {9,12,-1,76,7,8,99,5,3,7};
Пользователь вашей программы вводит два числа: num1 и num2.
Ваша программа должна вывести все элементы массива,
значение которых лежит в диапазоне от num1 до num2 и сосчитать их количество.
Например, для массива заданного выше, если num1=-1 а num2=5 вывод должен быть такой:

-1  5  3
--
3 элемента
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input num1 -> ");
        int num1 = scanner.nextInt();
        System.out.println("Input num2 -> ");
        int num2 = scanner.nextInt();

        int[] array = {9, 12, -1, 76, 7, 8, 99, 5, 3, 7};

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= num1 && array[i] <= num2) {
                System.out.println("[" + i + "]=" + array[i]);
                counter++;
            }
        }
        System.out.println("counter -> " + counter);
    }
}
