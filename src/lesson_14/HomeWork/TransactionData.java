package lesson_14.HomeWork;

public class TransactionData {
    int day;
    int month;
    int year;

    public TransactionData(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "TransactionData{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
