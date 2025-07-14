package ex_21_Polymorphism;

public class Lab171_Calculator {
    public static void main(String[] args) {
       calc c1 = new calc();
       c1.add(3,4);
       c1.add(3.414,4.56);
    }
}
class calc{
    int attribute;
    public int add(int a, int b)
    {
        return a+b;
    }
    public double add(double a, double b)
    {
        return a+b;
    }
}
