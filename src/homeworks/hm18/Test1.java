package homeworks.hm18;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int [] array = {6,4,9,7,11,-8};
        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }

}
