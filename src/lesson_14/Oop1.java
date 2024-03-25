package lesson_14;

public class  Oop1 {
    public static void main(String[] args) {
    MyDate1 date1 = new MyDate1(20,2,2021);
    MyDate1 date2 = new MyDate1(25,3,2022);
    MyDate1 date3 = new MyDate1(9,5,2024);

//        System.out.println(toString(date1));

        MyDate1[] array = {date1,date2,date3};
        for (int i = 0; i < array.length; i++) {
            System.out.println(toString(array[i]));
        }

        Person1 person = new Person1("Ivan", "Ivanov", date1);
        System.out.println(person.toString());
    }



    public static String toString(MyDate1 date){
        return date.day + "/" + date.month + "/" + date.year;

    }
}
