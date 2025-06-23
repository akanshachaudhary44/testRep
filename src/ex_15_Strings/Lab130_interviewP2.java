package ex_15_Strings;

import java.sql.SQLOutput;

public class Lab130_interviewP2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";//SCP-1


        String s2 = new String("Hello"); //OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //OA = 3

        System.out.println(s1 == s3);//false
        System.out.println(s1 == s2); //false
        System.out.println(s2 == s3);//false

        System.out.println(s1==s4); //True
        System.out.println(s3==s5);

        //equals (content) ->value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

    }
}
