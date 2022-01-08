package homeworks.hm4;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    // оценки по 10-ти баллной шкале
    double averageGradeInMathematics;
    double averageGradeInEconomics;
    double averageGradeInAForeignLanguage;
}
class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Ivan";
        st1.surname = "Sokolov";
        st1.course = 2;
        st1.averageGradeInMathematics = 8.5;
        st1.averageGradeInEconomics = 9.4;
        st1.averageGradeInAForeignLanguage = 9.1;

        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Mirakhmad";
        st2.surname = "Jalolov";
        st2.course = 1;
        st2.averageGradeInMathematics = 9.3;
        st2.averageGradeInEconomics = 9.5;
        st2.averageGradeInAForeignLanguage = 9.4;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Petr";
        st3.surname = "Ivanov";
        st3.course = 3;
        st3.averageGradeInMathematics = 8.9;
        st3.averageGradeInEconomics = 8.6;
        st3.averageGradeInAForeignLanguage = 9.2;

        System.out.println("Средняя оценка студента 2-го курса: "+st1.name+" "+st1.surname+" = "
                +(st1.averageGradeInMathematics+st1.averageGradeInEconomics+st1.averageGradeInAForeignLanguage)/3);
        System.out.println("Средняя оценка студента 1-го курса: "+st2.name+" "+st2.surname+" = "
                +(st2.averageGradeInMathematics+st2.averageGradeInEconomics+st2.averageGradeInAForeignLanguage)/3);
        System.out.println("Средняя оценка студента 3-го курса: "+st3.name+" "+st3.surname+" = "
                +(st3.averageGradeInMathematics+st3.averageGradeInEconomics+st3.averageGradeInAForeignLanguage)/3);

    }
}



