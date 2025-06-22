package ex_07_UserInput;
import java.util.Scanner;


public class Lab066_UserInput_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);

        System.out.println("Enter the Int");
        int int_input = scanner.nextInt();
        System.out.println(int_input);

        System.out.println("Enter the double");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);


    }

}
