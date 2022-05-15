package lessons2;

public class If {
    public static void main(String[] args) {
        int mayInt = 5;
        if(mayInt<10){
            System.out.println("да, верно");
        }else if (mayInt<20) {
            System.out.println("нет, не верно");
        }else {
            System.out.println("не, один из предыдущих случаев");
        }
    }
}
