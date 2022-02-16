package lessons.lesson12;

public class Test11 {

    void abc(){
        String str;
        int a = 5;
        if (a>10) {
            str = "Privet";
        }
        if (a<10) {
            str = "Poka";
        }
        else {
            str = "null";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int a = 30;
        int b = 31;

        int maximum = (a>b)?a:b;
            System.out.println(maximum);



    }

}

