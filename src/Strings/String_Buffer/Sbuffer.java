package Strings.String_Buffer;

import java.util.StringTokenizer;

public class Sbuffer {
    public static void main(String[] args) {
        String str = "Hello iam varun";
        StringTokenizer stringTokenizer = new StringTokenizer(str);

        // while (stringTokenizer.hasMoreTokens()) {
        //     System.out.print(stringTokenizer.nextToken()+" ");
        // }
        int i=0;
        while (i<=str.length()-1) {
            System.out.print(str.charAt(i));
            i++;
        }

        for(int j=0;j<str.length();j++){
            System.out.print(str.charAt(j));
        }
    }
}
