package homeworks.hm7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    int department;

    private Employee(int id, String surname, int age) {
        this.id = id;
        this.surname = surname;
        this.age = age;
    }

    public Employee(int id, String surname, int age, double salary, int department) {
        this(id, surname, age);
        this.salary = salary;
        this.department = department;
    }

    Employee(int id, String surname, int age, double salary){
        this(id, surname, age);
        this.salary = salary;

    }

    public void showId() {
        System.out.println(this.id);
    }

    public void showSurname() {
        System.out.println(this.surname);
    }

    public void showSalary() {
        System.out.println(this.salary);
    }

}

class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee(7, "Sokolov", 34, 135900.5, 5001);
        System.out.println(emp1.department);

        emp1.showSalary();

        Employee emp2 = new Employee(5, "Petrov", 28, 123750);
        System.out.println(emp2.surname);
        emp2.showSalary();
    }
}