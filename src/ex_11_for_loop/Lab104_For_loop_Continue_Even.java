package ex_11_for_loop;

public class Lab104_For_loop_Continue_Even {
    public static void main(String[] args) {
        for(int i=0; i<=50; i++)
        {
            if(i%2==0)
            {
                System.out.println("even->" +i);
                continue;
            }
            System.out.println("odd->" +i);
        }
    }
}
