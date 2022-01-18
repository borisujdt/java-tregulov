package lessons6;

public class Employee {
    Employee(int id2, String surname2, int age2){
        id = id2;
        surname = surname2;
        age = age2;
    }
    Employee(String surname2, int age2){
        surname = surname2;
        age = age2;
    }
    Employee(int id2, String surname2, int age2, double salary2, int department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    int id;
    String surname;
    int age;
    double salary;
    int department;
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 23);
        System.out.println(emp2.age);
        Employee emp3 = new Employee(7, "Sokolov", 34, 135900.5, 5001);
        System.out.println(emp3.department);

    }
}
