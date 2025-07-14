package ex_21_Polymorphism;

public class Lab173_Overriding_Automation {
    public static void main(String[] args) {
//        ChromeTC c1 = new ChromeTC();
//        c1.openBrowser();
//        Firefox f1 = new Firefox();
//        f1.openBrowser();


        class CommonAll {
            void openBowser() {
                System.out.println("starting the browser");
            }
        }
        class ChromeTC extends CommonAll {
            void openBrowser() {
                System.out.println("starting the browser");
            }
        }
        class Firefox extends CommonAll {
            void openBrowser() {
                System.out.println("Firefox the browser");
            }
        }
    }
}
