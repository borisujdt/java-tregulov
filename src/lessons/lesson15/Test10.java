package lessons.lesson15;

public class Test10 {
    public static void main(String[] args) {

        OUTER:
        for (int chas = 0; chas < 24; chas++) {
            int minuta = 0;
            INTER:
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;

            }
        }
    }
}
