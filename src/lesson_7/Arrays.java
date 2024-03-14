package lesson_7;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50};
        System.out.println("array.length -> " + array.length);

        System.out.println(array[0]);
        System.out.println(array[2]);
        array[3] = 400;
        System.out.println(array[3]);
        array[2] = array[4];
        System.out.println(array[2]);


        System.out.println("=====================================");
        // перебор элементов массива

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        System.out.println("=====================================");
        // прибавить ко всем элементам массива +10

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 10;
            System.out.print(array[i] + " ");
        }

        System.out.println("\n=====================================");
        // добавить +10 к элементам которые меньше 20

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 20) {
                array[i] = array[i] + 10;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println("\n=====================================");
        // вернуть длинну массива в обратном порядке

        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");

        }

        System.out.println("\n=====================================");
        // вернуть все нечетные числа в массиве

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                counter++;

            }
        }
        System.out.println(counter);

        System.out.println("\n=====================================");
        // создаем второй пустой массив и помещаем все элементы массива из первого

        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\n=====================================");
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
            System.out.print(array1[i] + " ");
        }
    }
}
