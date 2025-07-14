package ex_27_CollectionFramework_DSA.List;

import java.util.LinkedList;

public class Lab190_LL {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        animals.addLast("Elephant");
        System.out.println("LinkedList; "+animals);

        System.out.println("First element: "+animals.getFirst());
        System.out.println("Last element: "+animals.getLast());
    }
}
