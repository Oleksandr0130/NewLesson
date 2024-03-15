package lesson_8;

public class MethodExample {

    public static String monthName(int month) {

        if (month == 1) {
            return "January";
        } else if (month == 2) {
            return "February";
        }else{

        return "-";
        }

    }

    public static void printStringWithBrackets(String month){
        System.out.println("[" + month + "]");
    }

    public static void main(String[] args) {
        System.out.println(monthName(1));
        printStringWithBrackets(monthName(2));
    }
}
