//package ex_22_Encapsolation;
//
//public class Lab174_Encap_demo {
//    public static void main(String[] args) {
//        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin","pwd123");
//        vwoLogin1.setPassword("pass1234","true")
//                String pass = vwoLogin1.getPassword();
//        System.out.println(pass);
//    }
//}
//
////class VWOLogin{
////    public String username;
////    public String password;
////
////    public VWOLogin(String password, String username)
////    {
////        this.password = password;
////        this.username = username;     not encapsolation class
////    }
////}
//class GoodWOLogin {
//    private String username;
//    private String password;
//}
//
//    public GoodVWOLogin(String usr, String pwd) {
//        this.password = pwd;
//        this.username = usr;
//    }
//public String getUsername()
//{
//    return username;
//}
//
//public void setPassword(String password, boolean isAdmin)
//{
//    if(isAdmin) {
//        this.password = password;
//    }
//    else{
//        System.out.println("cant chnge");
//    }
//}