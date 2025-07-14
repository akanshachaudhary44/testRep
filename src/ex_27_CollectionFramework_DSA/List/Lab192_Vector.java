package ex_27_CollectionFramework_DSA.List;

import java.util.Iterator;
import java.util.Vector;

public class Lab192_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);

        v.add("Pramod");
        v.add("Amit");
        v.add("lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("lucky"));
        System.out.println(v);

        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.get(i));

            System.out.println("----------for each loop");
            for(Object o : v)
            {
                System.out.println(o);
            }
            System.out.println("-------------Iterator");
            Iterator iterator = v.iterator();
            while(iterator.hasNext())
            {
                System.out.println(iterator.next());
            }

        }
    }
}
