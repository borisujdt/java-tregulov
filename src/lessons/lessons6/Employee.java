package lessons.lessons6;

public class Employee {
    Employee(int id2, String surname2, int age2){
       this(id2, surname2, age2, 0.0, 0);

    }
    Employee(String surname3, int age3){
       this(0, surname3, age3, 0.0, 0);

    }
    Employee(int id4, String surname4, int age4, double salary4, int department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
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
