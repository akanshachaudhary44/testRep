package ex_27_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab187_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pramod");
        arrayList.add(null);
        arrayList.add("dutta");
        arrayList.add("dutta");//duplicate allowed
        arrayList.add("dutta");//Different data type allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList();
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());//false

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());//true


    }
}
