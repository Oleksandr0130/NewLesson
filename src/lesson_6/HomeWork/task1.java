package lesson_6.HomeWork;

import java.util.Scanner;

/*
Пользователь вашей программы вводит 2 целых числа num1 и num2.
Если num1 больше num2 программа выводит все числа начиная от num1 до num2.
 Если num1 меньше num2 программа выводит все числа начиная от num2 до num1.
 Если num1 равно num2 программа выводит один раз это число.
Например:

(10,12) ->
 */
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put value num1: ");
        int num1 = scanner.nextInt();

        System.out.println("Put value num2: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            for (int i = num1; i >= num2; i--){
                System.out.println(i);
            }
        } else if (num1 < num2) {
            for (int i = num1; i <= num2; i++){
                System.out.println(i);
            }
        }else {
            System.out.println(num1);
        }

        System.out.println("\n==========================\n");
        int i = num1;

        while(i > num2){
            System.out.println(i--);
        }
            System.out.println(i);
        while (i < num2){
            System.out.println(++i);
        }

        System.out.println("\n==========================\n");
        while (num1 == num2){
            System.out.println(num1--);
        }

    }
}
