package ex_12_While;

import java.util.Scanner;

public class Lab110_While_IQ_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int factorial = 1;
        if(number<=0)
        {
            System.out.println(factorial);
        }else{
            for(int i=1; i<= number; i++)
            {
                factorial=factorial*i;

            }
        }
        System.out.println(factorial);
    }
}
