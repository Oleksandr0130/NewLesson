package lesson_6.HomeWork;

public class task2 {
    public static void main(String[] args) {
        String text = "Hello my friends ";
        System.out.println(text.length());

        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                result++;
            }
        }
                System.out.println("count Space: " + result);
    }
}
