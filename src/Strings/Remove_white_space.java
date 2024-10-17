package Strings;

import java.util.StringTokenizer;

public class Remove_white_space {
    public static void main(String[] args) {
        String str = "         ja va st ar ";
        // String newStr = str.trim();
        // System.out.println(newStr);
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());
        String newStr = str.replaceAll(" ","");
        System.out.println(newStr);
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) != ' ') {
                result.append(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}
