package lesson_13.HomeWork;

public class MyDate1 {

    int day;
    int month;
    int year;

    public MyDate1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return  day +
                "/" + month +
                "/" + year +
                '}';
    }
}
