package homeworks.hm5;

public class BankAccount1 {
    int id;
    String name;
    double balance;

    void popolnenieSheta(double summa) {
        balance += summa;
    }

    void snyatieSoSheta(double summa) {
        balance -= summa;
    }

}

class BankAccount1Test {
    public static void main(String[] args) {

        BankAccount1 myAccount = new BankAccount1();
        BankAccount1 yorAccount = new BankAccount1();
        BankAccount1 hisAccount = new BankAccount1();

        myAccount.id = 1;
        myAccount.name = "Zaur";
        myAccount.balance = 12.35;
        myAccount.popolnenieSheta(200.5);

        yorAccount.id = 2;
        yorAccount.name = "Mike";
        yorAccount.balance = 2.00;
        yorAccount.popolnenieSheta(230.77);

        hisAccount.id = 3;
        hisAccount.name = "Ivan";
        hisAccount.balance = 124.10;
        hisAccount.snyatieSoSheta(50.00);

        System.out.println(myAccount.balance);
        System.out.println(yorAccount.balance);
        System.out.println(hisAccount.balance);

    }
}
