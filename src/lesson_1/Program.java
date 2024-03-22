package lesson_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value1: ");
        double val1 = scanner.nextDouble();

        System.out.println("Input value2: ");
        int val2 = scanner.nextInt();

        double result = 1;
        if (val2 >= 0) {
            for (int i = 0; i < val2; i++) {
                result *= val1;
            }
        }else {
            for (int i = 0; i > val2; i--) {
                result /= val1;
            }
        }
        System.out.println("result: " + result);
    }
}
