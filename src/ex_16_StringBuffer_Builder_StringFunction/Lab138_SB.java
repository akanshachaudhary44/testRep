package ex_16_StringBuffer_Builder_StringFunction;

public class Lab138_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        sb.append("Programming");
        System.out.println(sb);
        sb.delete(5,16);//delete the substring
        System.out.println(sb);
        sb.replace(0, 4, "C++");
        System.out.println(sb);
    }
}
