package lesson_14.HomeWork;



public class Transaction {
    private Account from;
    private Account to;
    private double amount;

    private TransactionData date;

    public Transaction(Account from, Account to, double amount, TransactionData date) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.date = date;
    }

    public String toAccountString(){
        return date + " " + from.getIBAN() + " " + to.getIBAN() + " " +  amount;
    }

    public String toNameAccountString(){
        return date +  " From: " + from.getClient() + " (" + from.getIBAN() + ") " + " To: " + to.getClient() + " (" + to.getIBAN() + ") "  +amount;
    }

    @Override
    public String toString() {
        return "Transaction" ;
    }
}
