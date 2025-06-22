package ex_test_p1;

import java.util.Scanner;

public class Test7_code {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the integer number");
        int number = Scanner.nextInt();
        if(number>0)
        {
            System.out.println("Positive :"  +number);
        }
        else if(number<0)
        {
            System.out.println("Negative :"  +number);
        }
        else{
            System.out.println("number is Zero");
        }
    }
}
