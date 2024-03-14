package lesson_3;

import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Put value num1 -> ");
        int num1 = scanner.nextInt();

        System.out.println("Put value num2 -> ");
        int num2 = scanner.nextInt();

        System.out.println("Put value num3 -> ");
        int num3 = scanner.nextInt();

        int sum;

        sum = num1 + num2 + num3;
        System.out.println("Sum value: " + sum);
    }
}
