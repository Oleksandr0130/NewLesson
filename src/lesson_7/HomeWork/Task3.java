package lesson_7.HomeWork;

import java.util.Random;

/*
Дан массив чисел, например double[]. Например, этот массив содержит показатели температуры.
Ваша программа должна определить среднее значение температуры.
Напомню, среднее значение это сумма всех элементов, деленная на количество элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        double[] array = {-2, -10, -14, 14, 10, 2, 3, 25};

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            sum = sum / array.length;
        }
        System.out.printf(String.format("sum %.1f", sum));
    }
}