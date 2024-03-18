package consultation;
/*
Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Распечатайте её через println. Сколько программа отбросила в дробной части?
 */
public class Program2 {

    public static int getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
            sum = sum / 10;
        return sum;
    }
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = getAverage(array);
        System.out.println(sum);


    }
}
