package ex_25_Abstraction;

public class Lab180_AB_Cars {
    public static void main(String[] args) {
//  WagonR car = new Engine.WagonR();
//  car.drive();

    }
}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
    void checkEngine()
    {
        System.out.println("Everthing is good");
    }
    class WagonR extends Engine{
        @Override
        void startEngine() {
            System.out.println("Starting the car");
        }

        @Override
        void stopEngine() {
            System.out.println("Stopping the car");
        }
        void drive()
        {
            checkEngine();
            startEngine();
            stopEngine();
        }
    }

}
