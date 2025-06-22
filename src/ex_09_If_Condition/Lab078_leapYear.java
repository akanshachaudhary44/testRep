package ex_09_If_Condition;

import java.util.Scanner;

public class Lab078_leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = scanner.nextInt();

        if(year % 4==0 && year % 100==0 && year % 400==0)
        {
            System.out.printf("leap", +year);

        }
        else{
            System.out.printf("not leap", +year);
        }
    }
}
