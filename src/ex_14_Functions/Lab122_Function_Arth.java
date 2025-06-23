package ex_14_Functions;

import java.util.Scanner;

public class Lab122_Function_Arth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = scanner.nextInt();

        System.out.println("Enter the num2");
        int b = scanner.nextInt();


        int result_sum = sum(a, b);
        System.out.println(result_sum);

        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);











    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int div(int a, int b)
    {
        return a/b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int mod(int a, int b)
    {
        return a%b;
    }
}
