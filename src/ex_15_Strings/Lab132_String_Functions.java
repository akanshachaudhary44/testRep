package ex_15_Strings;

public class Lab132_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(10));
        System.out.println(name.concat("Patel"));
        System.out.println(name.contains("om"));
        System.out.println(name.equals("Sonal"));

        System.out.println(name.equalsIgnoreCase("Sonal"));
        System.out.println(name.indexOf('o'));
         String s1 = "madam";
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.lastIndexOf("m"));
        System.out.println(name.length());
        System.out.println(name.replace('n', 'N'));



        String name4 = "Pramod@live.com@123";
        String[] split_name4 = name4.split("@;");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        System.out.println(name.substring(1,3));
        String anotherPalindrome = "Niagara. 0 roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);//roar
        System.out.println(extract);
    }
}
