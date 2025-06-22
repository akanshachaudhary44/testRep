package ex_05_TypeCasting;

public class Lab055_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        float total2 = course+GST; //Widening - auto - implicit
        float total3 = (float)course+GST;//widening - explicit
        System.out.println(total2);
        System.out.println(total3);

    }
}
