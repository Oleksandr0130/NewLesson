package lesson_14.HomeWork;



public class BankAPP {
    public static void main(String[] args) {


        MyDate birthday = new MyDate(15,7,1990);
        MyDate birthday2 = new MyDate(11,1,1985);
        TransactionData dateTransaction = new TransactionData(26,3,2024);

        Person client = new Person("Ivan", "Ivanov", birthday);
        Person client2 = new Person("Aleksandr", "Aleksandrovich", birthday2);

        Account account = new Account("DE123456",1_000, client,dateTransaction);
        Account account1 = new Account("DE654321", 3_000, client2,dateTransaction);

        Transaction transaction = new Transaction(account,account1,500,dateTransaction);
        Transaction transaction1 = new Transaction(account1,account,1500,dateTransaction);

        System.out.println(client.toString());
        System.out.println(client2.toString());
        System.out.println("\n====================================\n");

        System.out.println(transaction.toAccountString());
        transaction.executeTransaction();
        System.out.println(transaction.toNameAccountString());

        System.out.println(transaction1.toAccountString());
        transaction1.executeTransaction();

        System.out.println("\n==================================\n");

        System.out.println(account1.checkBalance());
        System.out.println(account.checkBalance());


    }
}
