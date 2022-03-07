package lessons2.lesson1;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i = i - 5) {
            System.out.println("Hello " + i);
        }
    }
}

class Test {
    public static void main(String[] args) {
        String[] massivStringov = {"Aa", "Bb", "Cc", "Dd", "Ee"};

        for (int i = massivStringov.length-1; i !=-1; i--) {
            System.out.println(massivStringov[i]);
        }

        for (String s : massivStringov) {
            System.out.println(s);
        }
    }
}
