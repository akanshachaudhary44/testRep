package ex_27_CollectionFramework_DSA.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab191_LL_P2 {
    public static void main(String[] args) {
        List mylist2 = new LinkedList();
        mylist2.add("pramod");
        mylist2.add("dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("dutta"));
        System.out.println(mylist2.indexOf("dutta"));
        System.out.println(mylist2.get(0));
        System.out.println("----");

        Iterator iterator = mylist2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


        }
    }
}