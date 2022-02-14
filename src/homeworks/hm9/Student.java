package homeworks.hm9;

public class Student {
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", "Sokolov");
        Student st2 = new Student("Petr", "Ivanov");
        Student st3 = new Student("Maksim", "Suslov");
        Student st4 = new Student("Nady", "Mikhaylova");
        Student st5 = new Student("Masha", "Kalugina");
        Student st6 = new Student("Igor", "Petrov");
        Student st7 = new Student("Oleg", "Shishcin");
        Student st8 = new Student("Mark", "Sidirov");
        st1 = null;
        st2 = null;
        st4 = null;
        st5 = null;
        st6 = null;
        st8 = null;

    }

}
