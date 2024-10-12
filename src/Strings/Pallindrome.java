package Strings;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome("amama"));
    }

    public static boolean isPallindrome(String str){
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length()-i-1)) {
                flag = 1;
            }
        }
        if (flag == 1) {
            return true;
        }
        else{
            return false;
        }
    }
}
