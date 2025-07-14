package ex_26_Abstraction_Interface;

public class Lab185_Abstraction {
    abstract class Incomplete_abstract{
        int a= 10;
        abstract void display1();
        void display2()
        {
            System.out.println("print");
        }
    }
    interface Incomplete_Interface{
        int a = 10;//final
        void display();
         //dafault void display2()
       // {
       //     System.out.println("default is allowed");
        }
    }
//}
