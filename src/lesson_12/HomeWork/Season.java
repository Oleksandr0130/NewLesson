package lesson_12.HomeWork;

import java.util.Scanner;

/*
#2
Написать следующую программу: пользователь вводит номер месяца,
система выдает название сезона (зима, весна, лето, осень).
 */
public class Season {
    public static void month(int choice) {
        while (choice != 0) {
            switch (choice) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
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
