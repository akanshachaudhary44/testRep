package ex_23_AccessModifier;

public class Lab176 {
    public static void main(String[] args) {

    }
}
class Father{
    int gold = 10;
    int car = 1;
    public int bhk3 =1;

}
class Son extends Father{
    void weCanuse()
    {
        System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);
    }
}
