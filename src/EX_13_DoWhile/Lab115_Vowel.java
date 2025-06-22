package EX_13_DoWhile;
import java.util.Scanner;

public class Lab115_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single char");
        char ch= scanner.next().toLowerCase().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("vowel");

        }
        else
        {
            System.out.println("consonent");
        }


    }
}
