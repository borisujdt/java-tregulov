package homeworks.hm12;

import lessons.lesson11.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Igor", 2, 7.5);
        Student st3 = new Student("Igor", 2, 7.0);
//        higherRating(st3, st2);
        analysisRating(st3,st2);
    }

    public static void higherRating(Student st1, Student st2) {

        if (st1.name == st2.name && st1.course == st2.course && st1.grade == st2.grade) {

            System.out.println("Studenti ravni");
        } else {
            System.out.println("Studenti ne ravni");
        }
    }

    public static void analysisRating(Student st1, Student st2) {
        if (st1.name == st2.name) {
            if (st1.course == st2.course){

                if (st1.grade == st2.grade){

                    System.out.println("Studenti ravni!!!");
                }else {
                    System.out.println("U studentov raznie ocenki");
                }
            }else {
                System.out.println("U studentov raznie course");
            }
        } else {
            System.out.println("U studentov razniya imena");
        ;
        }

    }
}

class Test{
    public static void main(String[] args) {
        int a = 75;
        if ( a > 10 ) {
            if (a > 100) {
                System.out.print("У вас очень много денег.");
            }else{
                System.out.print("У вас достаточно денег.");}
        } else{
            System.out.print("У вас маловато денег.");}
    }
}