package ex_10_Switch_Case;

import java.util.Scanner;

public class Lab082_Switch_withoutDefault {
    public static void main(String[] args) {
        //int day = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");
        }
    }
}
