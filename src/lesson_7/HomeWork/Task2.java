package lesson_7.HomeWork;


import java.util.Scanner;

/*
Дан массив чисел, например double[]. Например, этот массив содержит показатели температуры.
Ваша программа должна определить есть ли в этом массиве значения меньше заданной величины и, если есть, выдать сообщение на экран.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value ->");
        double value = scanner.nextDouble();

        double[] array = {1, 2, -5, 1.5, 0.1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= value) {
                System.out.println(array[i]);
            }
        }

    }
}
