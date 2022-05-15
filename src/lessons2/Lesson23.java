package lessons2;

public class Lesson23 {
    public static void main(String[] args) {
        /*StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
         */
        System.out.printf("This is a string, %s \n","NICE");
        System.out.printf("This is a string, %d \n", 2022);
        System.out.printf("%f This is %s a string, %d \n", 10.4, "NICE", 2022);
        System.out.println();
        System.out.printf("String %10d \n",532);
        System.out.printf("String %10d \n",5);
        System.out.printf("String %10d \n",100000);
        System.out.printf("String %10d \n",1000000000);
        System.out.printf("String %-10d \n",532);
        System.out.printf("String %-10d \n",5);
        System.out.printf("String %-10d \n",100000);
        System.out.printf("String %-10d \n",1000000000);
        System.out.printf("String %.2f \n",45.32265);
        System.out.printf("String %.3f \n",45.32265);
        System.out.printf("String %.4f \n",45.32265);
        System.out.printf("String %.5f \n",45.32265);
    }
}
