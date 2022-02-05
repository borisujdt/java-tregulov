package homeworks.hm6;

public class Student3 {

    int studentId;
    String name;
    String surname;
    int course;
    // оценки по 10-ти баллной шкале
    double averageGradeInMathematics;
    double averageGradeInEconomics;
    double averageGradeInAForeignLanguage;

    Student3(int studentId, String name2, String surname2, int course2, double averageGradeInMathematics2,
             double averageGradeInEconomics2, double averageGradeInAForeignLanguage2){
        this.studentId = studentId;
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
}
class StudentTest {
    static void averageOcenka(Student3 student){
        System.out.println("Средняя оценка студента: " + student.name + " " + student.surname + " = " + (student.averageGradeInMathematics
                + student.averageGradeInEconomics + student.averageGradeInAForeignLanguage) / 3);
    }

    public static void main(String[] args) {

        Student3 st1 = new Student3(1, "Ivan", "Sokolov", 2, 8.5,
                9.4, 9.1);

        Student3 st2 = new Student3(2, "Mirakhmad", "Jalolov", 1);


        Student3 st3 = new Student3();

        averageOcenka(st1);
        averageOcenka(st2);
        averageOcenka(st3);

    }

}
