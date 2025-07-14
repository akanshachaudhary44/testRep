package ex_22_Encapsolation;

public class Lab175_REAL_BANK {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit",100);
        long bal = amit.getBal();
        System.out.println(bal);
        amit.setBal(500,false);
        long bal2 = amit.getBal();
        System.out.println(bal2);
    }
}

class ICICIBank {


    private String name;
    private long bal;


    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed");
        }
    }


}

