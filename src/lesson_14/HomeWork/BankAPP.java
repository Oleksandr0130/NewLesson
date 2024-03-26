package lesson_14.HomeWork;



public class BankAPP {
    public static void main(String[] args) {
        MyDate birthday = new MyDate(15,7,1990);
        MyDate birthday2 = new MyDate(11,1,1985);
        TransactionData dateTransaction = new TransactionData(26,3,2024);

        Person client = new Person("Ivan", "Ivanov", birthday);
        Person client2 = new Person("Aleksandr", "Aleksandrovich", birthday2);

        Account account = new Account("DE123456",1_000, client,dateTransaction);
        Account account2 = new Account("DE654321", 3_000, client2,dateTransaction);

        Transaction transaction = new Transaction(account,account2,500,dateTransaction);

        System.out.println(client.toString());
        System.out.println(client2.toString());
        System.out.println("====================================");

        System.out.println(transaction.toAccountString());
        System.out.println(transaction.toNameAccountString());


    }
}
