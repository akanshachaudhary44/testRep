package ex_17_Arrays;

public class Lab149_Array_Finf_Element_Linear {
    public static void main(String[] args) {
        int[] a = {23,43, 45, 67, 87,90};

        int target = 67;
        for(int i =0; i<a.length; i++)
        {
            if(target == a[i])
            {
                System.out.println(i);
            }


        }
    }
}
