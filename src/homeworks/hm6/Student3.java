package homeworks.hm6;

public class Student3 {
    Student3(int studentId2, String name2, String surname2, int course2, double averageGradeInMathematics2,
             double averageGradeInEconomics2, double averageGradeInAForeignLanguage2){
        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        averageGradeInMathematics = averageGradeInMathematics2;
        averageGradeInEconomics = averageGradeInEconomics2;
        averageGradeInAForeignLanguage = averageGradeInAForeignLanguage2;
    }
    Student3(int studentId3, String name3, String surname3, int course3){
        this(studentId3, name3, surname3, course3, 0.0, 0.0, 0.0);
    }
    Student3(){

    }
    int studentId;
    String name;
    String surname;
    int course;
    // оценки по 10-ти баллной шкале
    double averageGradeInMathematics;
    double averageGradeInEconomics;
    double averageGradeInAForeignLanguage;

    void showinfo(){
        System.out.println("Средняя оценка студента: " + name + " " + surname + " = " + (averageGradeInMathematics
                + averageGradeInEconomics + averageGradeInAForeignLanguage)/3);
    }

}
class StudentTest {
    static void averageOcenka(Student3 student){
        System.out.println("Средняя оценка студента: " + student.name + " " + student.surname + " = " + (student.averageGradeInMathematics
                + student.averageGradeInEconomics + student.averageGradeInAForeignLanguage) / 3);
    }

    public static void main(String[] args) {

        Student3 st1 = new Student3();
        st1.studentId = 1;
        st1.name = "Ivan";
        st1.surname = "Sokolov";
        st1.course = 2;
        st1.averageGradeInMathematics = 8.5;
        st1.averageGradeInEconomics = 9.4;
        st1.averageGradeInAForeignLanguage = 9.1;

        Student3 st2 = new Student3();
        st2.studentId = 2;
        st2.name = "Mirakhmad";
        st2.surname = "Jalolov";
        st2.course = 1;

        Student3 st3 = new Student3();

        averageOcenka(st1);
        averageOcenka(st2);
        averageOcenka(st3);

    }

}
