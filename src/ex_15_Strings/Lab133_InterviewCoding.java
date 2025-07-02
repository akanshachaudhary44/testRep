package ex_15_Strings;


import java.util.Scanner;

public class Lab133_InterviewCoding {
    public static void main(String[] args) {
        //palindrome
        //madam -> reverse(madam) -> madam ==
        //s1 = madam
        //s1_reverse = madam
        // s1 == s1_reverse
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String newString_reversed = reverseString(input);

        if (newString_reversed.equalsIgnoreCase(input)) {
            System.out.println("palindrome");

        } else {
            System.out.println("not palindrome");
        }


    }

    static String reverseString(String userInput)
    {
        String reversed = "";
        for(int i = userInput.length()-1; i>=0; i--)
        {
            reversed = reversed+ userInput.charAt(i);
        }
        return reversed;
        //StringBuilder stringBuilder = new StringBuilder(userInput);

    }
}




