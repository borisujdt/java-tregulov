package homeworks.hm5;

public class Employee {
    int employeeId;
    String surname;
    int age;
    double salary;
    int department;

    public Employee(int employeeId, String surname, int age, double salary, int department) {
        this.employeeId = employeeId;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public void salaryXUp() {
        System.out.println("Зарплата до повышения: "+salary);
        salary *=2;
        System.out.println("Зарплата после повышения: "+salary);
    }

}

class Test{
    public static void main(String[] args) {
        Employee ivan = new Employee(1, "Иван", 45, 25000, 5);
        Employee petr = new Employee( 2, "Петр", 37, 23500.5, 7);

        ivan.salaryXUp();

        System.out.println();

        petr.salaryXUp();

    }
}