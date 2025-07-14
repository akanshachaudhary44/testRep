//package ex_26_Abstraction_Interface;
//
//public class Lab183_Car_practical_interface {
//    public static void main(String[] args) {
//        Car1 tesla = new Car1();
//        tesla.drive();
//    }
//}
//
////class Car1 implements Engine1, Brakes{
//    void drive()
//    {
//        startEngine();
//        applyBreak();
//        stopEngine();
//    }
//
//    @Override
//    public void startEngine() {
//        System.out.println("Start Engine");
//    }
//    @Override
//    public void stopEngine() {
//        System.out.println("Stop Engine");
//    }
//
//    public void applyEngine() {
//        System.out.println("apply Engine");
//    }
//   public void money()
//   {
//       System.out.println("son has to earn by itself");
//   }
//}
//interface Brakes{
//    void applyBreak();
//void money();
//}
//interface Engine1{
//    void startEngine();
//    void money();
//    void stopEngine();
//    default void CompleteF1()
//
//    {
//        System.out.println("Default complete function");
//    }
//}
//
//
