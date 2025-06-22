package ex_06_Ternary_Operator;

public class Lab061_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23;
        // age< 18 - minor
        // 18 <age - 65 - adult
        // age > 65 - senior citizen
        int age = 23;
        String result = (age<18)?"Minor":(age<65)?"adult":"senior";
        System.out.println(result);
    }
}
