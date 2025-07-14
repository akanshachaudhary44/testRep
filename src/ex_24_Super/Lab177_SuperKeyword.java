package ex_24_Super;

public class Lab177_SuperKeyword {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}
class Vehicle{
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Default C");
    }
    Vehicle(int a){
        System.out.println("Param Constructor");
    }
    void message(int a)
    {
        System.out.println("Type 2");
    }
    void message()
    {
        System.out.println("Type 1");
    }
    int message(String a)
    {
        System.out.println("Type 4");
        return 0;
    }

    void display()
    {
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    Car()
    {
        super();
    }
    Car(int a)
    {
        super(10);
    }

    @Override
    void display() {
        System.out.println(super.maxSpeed);// parent call with super
        System.out.println(this.maxSpeed);// call itself with this(car)
        System.out.println("Hi Override");
    }
}
