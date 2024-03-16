package lesson_8.HomeWork;
/*
Допустим дан массив имен, например, заданный так:

String[] names = {"Jack", "John", "Vlad", "Alex"};

Написать метод void printArray(String[] array), который выводит на экран весь массив
Написать метод int calcSum (String[] array), который возвращает сумму символов во всех именах данного массива
Написать метод int calcNamesByChar (String[] array, char ch), который возвращает количество имен в массива, начинающихся на заданную букву
 */


public class Task1 {
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int calcSum(String[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                sum += array[i].length();
        }
        return sum;
    }

    public static int calcNamesByChar (String[] array, char ch){
        int count = 0;
        for (String name : array){
            if (name.charAt(0) == ch || name.charAt(0) == Character.toUpperCase(ch)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] names = {"Jack", "John", "Vlad", "Alex"};
        int sum = calcSum(names);


        printArray(names);
        System.out.println();
        System.out.println(sum);
        System.out.println(calcNamesByChar(names, 'J') + " names");
        System.out.println(calcNamesByChar(names, 'A') + " names");
        System.out.println(calcNamesByChar(names, 'V') + " names");


    }
}
