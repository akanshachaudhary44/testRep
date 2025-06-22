package ex_11_for_loop;

public class Lab103_For_loop_Continue {
    public static void main(String[] args) {
        for(int i=0; i<50; i++)
        {
            if(i==5){
                continue;   //skip the code and move to next step
            }
            System.out.println(i);
        }
    }
}
