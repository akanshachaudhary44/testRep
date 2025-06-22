package ex_test_p1;

public class Test3_code {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c1 = a>=b || a!=b;  //  F||T= T
        boolean c = a<=b && a==b;   // T&&F=F
        boolean  num = c1 && c;     // T && F = F=T
        boolean result = c1 || c;   // T || F= T
        System.out.println(!num);
        System.out.println(result);
    }
}
