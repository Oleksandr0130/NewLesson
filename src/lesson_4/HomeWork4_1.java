package lesson_4;


import java.util.Scanner;

/*
Есть прибор у которого есть 2 колбы.
В программе дано две переменных,
которые содержат температуру каждой колбы (значение для этих переменных можно задать со Scanner, можно просто присвоить значение в программе).
Считается, что прибор работает корректно, если в одной из колб, температура равна 0, в другой находится в диапазоне от 10 до 50 градусов.
 */
public class HomeWork4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Put value t1 -> ");
        int t1 = scanner.nextInt();

        System.out.println("Put value t2 -> ");
        int t2 = scanner.nextInt();

        boolean result = true;
        if (t1 != 0 && t2 < 10 || t2 > 50){
            result = false;
            System.out.println("Arror check temperature: " + result);
        }else {
            System.out.println("All is ok: " + result);
        }
    }
}
