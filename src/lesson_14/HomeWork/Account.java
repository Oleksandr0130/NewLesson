package lesson_14.HomeWork;




public class Account {
    private String IBAN;
    private double balance;
    private Person client;
    private TransactionData open;

    public Account(String IBAN, double balance, Person client, TransactionData open) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.client = client;
        this.open = open;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Person getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                ", open=" + open +
                '}';
    }
}
