package consultation;

import java.util.Scanner;

/*
Необходимо написать программу,
 где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
  а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
 */
public class Program1 {

    public static int scannerMain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value 1, 2, 3 or 0 for exit: ");
        int val = scanner.nextInt();
        return val;
    }

    public static void inputValue(int val){
        if (val == 1){
            System.out.println(" Value is: " + val);
        } else if (val == 2) {
            System.out.println(" Value is: " + val);
        } else if (val == 3) {
            System.out.println(" Value is: " + val);
        }else if (val == 0){
            System.out.println("Goodbye");
        }else {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        int userInput;
        do {
            userInput = scannerMain();
            inputValue(userInput);
        }while (userInput != 0);

    }
}
