package ex_16_StringBuffer_Builder_StringFunction;

public class Lab137_SBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("world");
        sb.reverse();
        System.out.println(sb);
    }
}
