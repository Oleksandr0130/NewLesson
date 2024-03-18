package lesson_8.HomeWork;

/*
Допустим дан массив чисел.

Написать метод, который возвращает самое маленькое число в этом массиве
Написать метод, который возвращает индекс заданного числа в массиве.
Если в массиве нет заданного числа, возвращаем -1,
если заданное число встречается несколько раз,
возвращаем первый индекс, где встретилось данное число.
 */
public class Task2 {

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int getIndexByValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {5,4,3};

        System.out.println(minValue(array));
        System.out.println(getIndexByValue(array, 3));
    }
}
