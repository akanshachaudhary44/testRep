package ex_06_Ternary_Operator;

public class Lab062_TO_Three_MAX {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        // step 1: Find input/outputs
        //I/O - n1,n2,n3 - int
        //O/P - String - max number


        // step 2 - rough logic,
        //n1>n2 and n1>n3-n1
        //n2>n3 and n2> n1 - n2
        //n3

       // int max = (n1>n2) ? A:B;
        int max = (n1>n2) ? (n1>n3)? n1:n3 : (n2>n3) ? n2 : n3;
        //A- (n1>n3)? n1:n3
        //B - (n2>n3) ? n2 : n3
        System.out.println(max);
    }
}
