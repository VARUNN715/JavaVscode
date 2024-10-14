package Strings;

public class Remove_white_space {
    public static void main(String[] args) {
        String str = "         ja va st ar ";
        // String newStr = str.trim();

        // System.out.println(newStr);
        String newStr = str.replaceAll(" ","");
        System.out.println(newStr);
    }
}
