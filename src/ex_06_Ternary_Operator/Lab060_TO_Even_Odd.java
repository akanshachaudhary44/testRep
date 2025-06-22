package ex_06_Ternary_Operator;

public class Lab060_TO_Even_Odd {
    public static void main(String[] args) {
        //10%2=0//even
        int num = 10;
        String result = (num%2==0)? "Even" : "Odd";
        System.out.println(result);
    }
}
