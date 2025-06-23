package ex_14_Functions;

public class Lab121_UD_Part1 {
    // User Defined Functions.


    // 1, without parameters and without Return Type
    // 2. without Parameters but with Return Type
    // 3. without Parameters and without Return Type
    // 4. with Parameters and with Return type
    public static void main(String[] args) {
        wp_wr_greet();
        // 2. without Parameters but with Return Type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        // 3. without Parameters and without Return Type
        greet_with_details("Pramod", 65, 100);
        greet_with_details("Ankit", 100, 120);

        // 4. with Parameters and with Return type
        int sum = sum_of_two_numbers(3,4);
        int sum1 = sum_of_three_numbers(234,346,34354);

        System.out.println(sum);
        System.out.println(sum1);

    }
    // 1, without parameters and without Return Type. Declare/Define
    static void wp_wr_greet()
    {
        System.out.println("Hi, How are you");
    }

    // 2. without Parameters but with Return Type
    static String greet_with_hello_wp_with_RT()
    {
        System.out.println("Hi");
        return "Hi, are you?";

    }

    // 3. without Parameters and without Return Type
    static void greet_with_details(String name, int age, double salary)
    {
        System.out.println("Your name is ->" +name + "\n your age is " +age + "\n your salary is " +salary);
    }


    // 4. with Parameters and with Return type

    static int sum_of_two_numbers(int a,int b)
    {
        return a+b;
    }

    static int sum_of_three_numbers(int a,int b, int c)
    {
        return a+b+c;
    }



}
