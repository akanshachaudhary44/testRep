package ex_10_Switch_Case;

public class Lab090_MultipleChoice {
    public static void main(String[] args) {
        int itemcode = 006;

        switch(itemcode){
            case 001,002,005:
                System.out.println("All of them are electric");
                break;
            case 004,007,006:
                System.out.println("This is mech gadget");
                break;
            default:
                System.out.println("none");


        }
    }
}
