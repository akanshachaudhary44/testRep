package ex_17_Arrays;

import java.util.Arrays;

public class Lab143_Arrays_print {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println("----------------");

//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);

            Arrays.sort(marks);
            for (int i = 0; i < marks.length; i++) {
                System.out.println(marks[i]);
            }
        }
    }


