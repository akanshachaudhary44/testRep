package ex_11_for_loop;

public class Lab102_For_loop_Break {
    public static void main(String[] args) {
        for(int i=0; i<50; i++)
        {
            if(i==5){
                break;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
