package lesson_13;

public class Oop {
    public static void main(String[] args) {
    MyDate date1 = new MyDate(20,2,2021);
    MyDate date2 = new MyDate(25,3,2022);
    MyDate date3 = new MyDate(9,5,2024);

//        System.out.println(dateToString(date1));

        MyDate[] array = {date1,date2,date3};
        for (int i = 0; i < array.length; i++) {
            System.out.println(dateToString(array[i]));
        }

        Person person = new Person("Ivan", "Ivanov", date1);
        System.out.println(person.toString());
    }



    public static String dateToString(MyDate date){
        return date.day + "/" + date.month + "/" + date.year;

    }
}
