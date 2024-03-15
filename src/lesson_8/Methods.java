package lesson_8;

public class Methods {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]=" + array[i] + " ");
        }
        System.out.println("\nsumma: " + calcSum(array));
        System.out.println();
    }

    public static int calcSum(int array[]){
         int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 6, 9, 3, 5};
        int[] array2 = {1, 5, 23, 0, 5};
        int[] array3 = {-2, -2, 5, 12, 6};
        int[] array4 = {1, 43, -43, 76, 43};

        printArray(array1);
//        System.out.println(calcSum(array1));
        printArray(array2);
//        System.out.println(calcSum(array2));
        printArray(array3);
//        System.out.println(calcSum(array3));
        printArray(array4);
//        System.out.println(calcSum(array4));
    }
}
