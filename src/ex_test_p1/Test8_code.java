package ex_test_p1;

import java.util.Scanner;

public class Test8_code {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int c = Scanner.nextInt();
        int large = Scanner.nextInt();

        if(a>b  && a>c)
        {
            large = a;
            System.out.println("a is the greatest");

        }
        if(b>a && b>c)
        {
            large = b;
            System.out.println("b is the greatest");

        }
        else
        {
            large = c;
            System.out.println("c is the greatest");

        }
    }
}
