package ex_19_Constructor;

public class Lab163_DC {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);
    }
}
class Car{
    String name;
    int year;
    String model;
    //DC

    Car()
    {
        name = "Unknow Car";
        year = 1991;
        model = "xxxx";
    }
}