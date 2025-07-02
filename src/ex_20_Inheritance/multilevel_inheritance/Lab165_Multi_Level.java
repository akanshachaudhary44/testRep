package ex_20_Inheritance.multilevel_inheritance;

public class Lab165_Multi_Level {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gf();    // Grandfather class se call kiya h function ko

        System.out.println("------------");
        Father f1 = new Father();
        f1.f();  // father class se
        f1.gf();  // grandfather class se

        System.out.println("------------");


        Son s1 = new Son();
        s1.gf();
        s1.s();
    }
}
