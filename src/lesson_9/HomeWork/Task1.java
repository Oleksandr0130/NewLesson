package lesson_9.HomeWork;


/*
Допустим дан массив имен, например, заданный так:

String[] names = {"Jack", "John", "Vlad", "Alex"};

Написать метод int indexOf(String[] array, String str),
который возвращает индекс имени заданного в параметре str.
Если такого имени нет, возвращаем -1
Написать метод int indexOf(String[] array, String str, int startIndex),
который возвращает индекс имени заданного в параметре str.
Если такого имени нет, возвращаем -1.
При этом, поиск осуществляется начиная с индекса startIndex
 */
public class Task1 {
    public static int indexOf(String[] array, String str){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                return i;
            }
        }

        return -1;
    }

    public static int indexOf(String[] array, String str, int startIndex){
        for (int i = startIndex; i < array.length; i++) {
            if (array[i].equals(str)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"Jack", "John", "Vlad", "Alex","Sylwia", "Andrey", "Katerina", "Aleksandr"};

        System.out.println(indexOf(names,"Jack"));
        System.out.println(indexOf(names,"John"));
        System.out.println(indexOf(names,"Vlad"));
        System.out.println(indexOf(names,"Alex"));
        System.out.println(indexOf(names, "Sylwia", 2));

    }
}
