package homeworks.hm14;

public class Test1 {
    public static void time() {
        OUTER:
        for (int hour = 0; hour <= 5; hour++) {
            INNER:
            for (int minute = 0; minute <= 59; minute++) {

                for (int seconds = 0; seconds <= 59; seconds++) {
                    System.out.println(hour + ":" + minute + ":" + seconds);
                    if (hour > 1 && minute % 10 == 0 && minute > 0) {
                        break OUTER;
                    }
                    if (seconds * hour > 60) continue INNER;
                }
            }

        }
    }

    public static void main(String[] args) {
        time();
    }
}

class Test10 {
    public static void time2() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int seconds = 0; seconds < 60; seconds++) {


                    if (seconds * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + seconds);
                }

            }
        }
    }

    public static void main(String[] args) {
        time2();
    }


}

