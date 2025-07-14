package ex_25_Abstraction;

public class Lab179_Abstraction {
    public static void main(String[] args) {
        Car c1 = new Car();
        //Father f1 = new Father(); //This is abstract in nature.
        Child child = new Child();
        Father f2 = new Child();
        child.loan50k();
    }
}

class Car{
    void done()
    {

    }
}

abstract class Father{
    //Abstract Function
    abstract void loan50k();
    //as a complete function
    void loan25k()
    {
        System.out.println("Given the 25k");
    }
}
class Child extends Father{
    void loan50k()
    {
        System.out.println("Son has to give the 50k loan");
    }
}
