package Strings;

public class Reverse_string {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
        StringBuilder sbb = new StringBuilder(str);
        System.out.println(sbb.reverse());
    }
}
