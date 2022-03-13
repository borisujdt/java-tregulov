package lessons2.lesson2;

public class Lesson20 {
    public static void main(String[] args) {
        Human2 h1 = new Human2("Bob", 40);
        Human2 h2 = new Human2("Tom", 30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human2 h3 = new Human2("Ivan",25);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
        System.out.println(h1);


    }
}

class Human2 {
    private String name;
    private int age;

    private static int countPeople;

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }

}
