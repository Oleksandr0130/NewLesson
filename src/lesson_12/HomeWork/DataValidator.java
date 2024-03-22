package lesson_12.HomeWork;

import java.util.Scanner;


/*
Написать следующую программу: пользователь 3 числа int: день, месяц и год.
Программа определяет, может ли это быть корректной датой.
Например: 29 2 2001 - нет, а 29 2 2004 - да.
 */
public class DataValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных от пользователя
        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        // Проверка корректности введенной даты
        boolean isValid = isValidDate(day, month, year);

        // Вывод результата
        if (isValid) {
            System.out.println("Результат: Да, " + day + " " + getMonthName(month) + " " + year + " года существует.");
        } else {
            System.out.println("Результат: Нет, " + day + " " + getMonthName(month) + " " + year + " года не существует.");
        }
    }

    // Метод для определения корректности введенной даты
    public static boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return day <= daysInMonth[month - 1];
    }

    // Метод для определения високосного года
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Метод для получения названия месяца по его номеру
    public static String getMonthName(int month) {
        String[] monthNames = {"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        return monthNames[month - 1];
    }


}
