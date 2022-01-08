package lessons.lesson5;

public class Human {
    String name;
    Car4 car;
    BankAccount bA;

    void info (){
        System.out.println("Imya: "+name+" cvet mashini: "+car.color+" Balans bankovskogo scheta: "+bA.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car4("red", "V8");
        h.bA = new BankAccount(18, 250.5);
        h.info();

    }
}

class Car4 {
    Car4(String c, String e) {
    color = c;
    engine = e;

    }
    String color;
    String engine;

}

class  BankAccount{
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}
