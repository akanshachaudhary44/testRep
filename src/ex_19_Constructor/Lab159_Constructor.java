package ex_19_Constructor;

public class Lab159_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        new Student();

    }
}
    class Student{
        String name;

        //is called default constructor, same name as the class name.
        Student()
        {
            System.out.println("DC");


    }
}
