package Strings;

public class Remove_spl_char {
    public static void main(String[] args) {
        String str = "ja!va$&st%ar";
        //approach 1
        // String newstr = str.replaceAll("[^a-zA-Z0-9]","");
        // System.out.println(newstr);
        String newStr = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(newStr);
    }
}
