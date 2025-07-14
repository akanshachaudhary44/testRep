package ex_21_Polymorphism;

public class Lab170_WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser("chrome");
    }
}
class Browser{
    void startBrowser()
    {
        System.out.println("starting default browser");
    }
    String startBrowser(String browser)
    {
        System.out.println("starting browser"+browser);
        return browser;
    }
}
