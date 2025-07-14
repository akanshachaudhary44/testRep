package ex_21_Polymorphism;

public class Lab169_overloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3,5);
        int r2 = m1.add(3,4,6);
        //double r3 = m1.add("pramod","dutta");

    }
}
class MathOperations {
    //same method but different arguments and different return type

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;

    }

    double add(double a, double b) {
        return a + b;
    }
}