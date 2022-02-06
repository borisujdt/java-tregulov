package lessons.lesson7;

public class Employee {
    double salary;

   void dvoynayaZP(){
       double result = salary*2;
        System.out.println("Novaya z/p="+result);
    }
    Employee(double salary){
        this.salary = salary;
    }

    static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();

    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();

    }
}
