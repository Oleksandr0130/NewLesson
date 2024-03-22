package lesson_12.HomeWork;

import java.util.Scanner;


/*
#1
Написать следующую программу: пользователь вводит номер месяца, система выдает название месяца.

#2
Написать следующую программу: пользователь вводит номер месяца, система выдает название сезона (зима, весна, лето, осень).

#3
Написать следующую программу: пользователь 3 числа int: день, месяц и год. Программа определяет, может ли это быть корректной датой. Например: 29 2 2001 - нет, а 29 2 2004 - да.
 */
public class Calendar {
    public static void month(int choice) {
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the month of the year  -> ");
            choice = scanner.nextInt();
        }
        System.out.println("Goodbye");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month of the year  -> ");
        int choice = scanner.nextInt();

        month(choice);

    }
}


