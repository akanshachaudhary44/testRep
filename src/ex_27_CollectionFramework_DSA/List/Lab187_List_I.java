package ex_27_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab187_List_I {
    public static void main(String[] args) {
        List l = new ArrayList(); //Dynamic dispatch
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("blah blah");
    }
}
