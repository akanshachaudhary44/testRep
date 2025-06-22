package ex_05_TypeCasting;

public class Lab052_Widening_explicit {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // widening - implicit
        int a1 = (int)b; // widening - Explicit
    }
}
