package homeworks.hm13;

public class Month {

    public int a;

    public static void daysInAmonth(int a) {
        switch (a) {
            case 1:
                System.out.println("Январь 2022 года, в месяце 31 дней");
                break;
            case 2:
                System.out.println("Февраль 2022 года, в месяце 28 дней");
                break;
            case 3:
                System.out.println("Март 2022 года, в месяце 31 дней");
                break;
            case 4:
                System.out.println("Апрель 2022 года, в месяце 30 дней");
                break;
            case 5:
                System.out.println("Май 2022 года, в месяце 31 дней");
                break;
            case 6:
                System.out.println("Июнь 2022 года, в месяце 30 дней");
                break;
            case 7:
                System.out.println("Июль 2022 года, в месяце 31 дней");
                break;
            case 8:
                System.out.println("Август 2022 года, в месяце 31 дней");
                break;
            case 9:
                System.out.println("Сентябрь 2022 года, в месяце 30 дней");
                break;
            case 10:
                System.out.println("Октябрь 2022 года, в месяце 31 дней");
                break;
            case 11:
                System.out.println("Ноябрь 2022 года, в месяце 30 дней");
                break;
            case 12:
                System.out.println("Декабрь 2022 года, в месяце 31 дней");
                break;
            default:
                System.out.println("Такого месяца нет");

        }
    }

    public static void main(String[] args) {
        Month.daysInAmonth(11);
        daysInAmonth(0);
    }
}

