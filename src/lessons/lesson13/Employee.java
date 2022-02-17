package lessons.lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("Пятьница") {
            case "Понедельник":

            case "Вторник":

            case "Среда":

            case "Четверг":

            case "Пятьница":
                System.out.println("Работа до 18:00");
                break;
            case "Суббота":
                System.out.println("Работа до 14:00");
                break;
            case "Воскресенье":
                System.out.println("Работы нет");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
}
