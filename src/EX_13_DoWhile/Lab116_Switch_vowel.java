package EX_13_DoWhile;

import java.util.Scanner;

public class Lab116_Switch_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single char");
        char ch= scanner.next().toLowerCase().charAt(0);


        switch(ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");
            default -> System.out.println("consonents");
        }
    }
}
