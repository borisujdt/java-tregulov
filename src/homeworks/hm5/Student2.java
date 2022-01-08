package homeworks.hm5;

public class Student2 {
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
    static void averageOcenka(Student2 student){
        System.out.println("Средняя оценка студента: " + student.name + " " + student.surname + " = " + (student.averageGradeInMathematics
                + student.averageGradeInEconomics + student.averageGradeInAForeignLanguage) / 3);
    }

    public static void main(String[] args) {

        Student2 st1 = new Student2();
        st1.studentId = 1;
        st1.name = "Ivan";
        st1.surname = "Sokolov";
        st1.course = 2;
        st1.averageGradeInMathematics = 8.5;
        st1.averageGradeInEconomics = 9.4;
        st1.averageGradeInAForeignLanguage = 9.1;

        Student2 st2 = new Student2();
        st2.studentId = 2;
        st2.name = "Mirakhmad";
        st2.surname = "Jalolov";
        st2.course = 1;
        st2.averageGradeInMathematics = 9.3;
        st2.averageGradeInEconomics = 9.5;
        st2.averageGradeInAForeignLanguage = 9.4;

        Student2 st3 = new Student2();
        st3.studentId = 3;
        st3.name = "Petr";
        st3.surname = "Ivanov";
        st3.course = 3;
        st3.averageGradeInMathematics = 8.9;
        st3.averageGradeInEconomics = 8.6;
        st3.averageGradeInAForeignLanguage = 9.2;

        averageOcenka(st1);
        averageOcenka(st2);
        averageOcenka(st3);

    }

}

