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

    public String toString() {
        return "TransactionData: " + day +
                " / " + month +
                " / " + year ;
    }

    public  String toDateFormatString(){
        return year + " / " + month + " / " + day;
    }
}
