package ex_09_If_Condition;

import java.util.Scanner;

public class Lab079_Grade {
    public static void main(String[] args) {
        System.out.println("Enter the mark");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        if(mark>=90||mark<100)
        {
            System.out.printf("Grade A", mark);
        }
        else if(mark>=80||mark<=89)
        {
            System.out.printf("Grade B", mark);
        }
        else if(mark>=70||mark<=79)
        {
            System.out.printf("Grade C", mark);

        }
        else if(mark>=60||mark<=69)
        {
            System.out.printf("Grade D", mark);
        }
        else if(mark>=0||mark<=59){
            System.out.printf("Grade F", mark);
        }
    }
}
