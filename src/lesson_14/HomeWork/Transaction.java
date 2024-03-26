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

    public void executeTransaction(){
        if (from.getBalance() >= amount){
            from.setBalance(from.getBalance() - amount);

            to.setBalance(to.getBalance() + amount);
        }else {
            System.out.println("Недостаточно средств на счете!!!");
        }
    }

    public String toAccountString(){
        return date.toDateFormatString() + " " + from.getIBAN() + " " + "\n" + to.getIBAN() + " " +  amount;
    }

    public String toNameAccountString(){
        return date.toDateFormatString() +  " From: " + from.getClient() + " (" + from.getIBAN() + ") " + "\nTo: " + to.getClient() + " (" + to.getIBAN() + ") "  +amount;
    }

    @Override
    public String toString() {
        return "Transaction";
    }
}
