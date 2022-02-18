package lessons.lesson14;

public class Test6 {
    public void time() {
        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Nachalo outer loopa");
            INNER:
            for (int minuta = 0; minuta <= 59; minuta++) {
                System.out.println(chas + ":" + minuta);
                if (minuta == 30) break OUTER;
            }

            System.out.println("Konec outer loopa");

        }

    }

    public static void main(String[] args) {
//        Test6 t = new Test6();
//        t.time();

        for (int i = 0;i<10;i++){
            System.out.println();
        }

        int j=0;

        while (j>10){
            System.out.println(j);
            j++;
        }
    }
}
