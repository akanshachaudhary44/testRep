package ex_10_Switch_Case;

public class Lab089_JDK13Above {
    public static void main(String[] args) {
        // no need break keyword in jdk 13
        int itemCode = 002;
        switch(itemCode)
        {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");


        }
    }
}
