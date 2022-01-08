package lessons.lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
}

class BankAccountTest{
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YorAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Zaur";
        MyAccount.balance=12.35;

        YorAccount.id=2;
        YorAccount.name="Mike";
        YorAccount.balance=2.00;

        HisAccount.id=3;
        HisAccount.name="Ivan";
        MyAccount.balance=124.12;

        System.out.println(YorAccount.name);
    }
}
