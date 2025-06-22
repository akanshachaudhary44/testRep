package ex_05_TypeCasting;

public class Lab053_TypeCasting_Name {
    public static void main(String[] args) {
        int val = 300;
        // byte b = val; // narrowing (int - byte) - implicit casting is not allowed.
        byte b1 = (byte)val; //Narrowing (int - byte) - Explicit casting is not allowed
        // data loss
        System.out.println(b1);
    }
}
