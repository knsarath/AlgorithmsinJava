package main.util;

public class Print {
    public static void array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String string = (array[i]) +  ((i == array.length - 1) ? "" : ", ");
            System.out.print(string);
        }
        System.out.println();
    }
}
