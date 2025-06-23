package ex_10_Switch_Case;

import java.util.Scanner;

public class Lab083_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();  //it will show result in small and capital letter

        switch (browser)
        {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                break;

            case "edge":
                System.out.println("Execute the edge code");
            default:
                System.out.println("no idea");
                break;
        }
    }
}
