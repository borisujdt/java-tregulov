package homeworks.hm5;

public class BankAccount1 {
    int id = 10;
    String name = "Petr";
    double balance = 100;

    void popolnenieSheta(double summaPopolneniya){
        System.out.println("Balans do popolneniya: "+balance);
        System.out.println("Balans popolnyaetsya na; "+summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balans posle popolneniya: "+balance);
        System.out.println();
    }

    void snyatieSoSheta(double summaSnyatiya){
        System.out.println("Balans do snyatiya: "+balance);
        System.out.println("Balans umenshaetsya na; "+summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balans posle snyatiya: "+balance);
    }

}

class BankAccount1Test {
    public static void main(String[] args) {

        BankAccount1 myAccount = new BankAccount1();

        myAccount.popolnenieSheta(200.5);
        myAccount.snyatieSoSheta(150.2);
    }
}
