package Strings;

public class Reverse_string {
    public static void main(String[] args) {
        String str = "Hello";
        // StringBuffer sb = new StringBuffer(str);
        // System.out.println(sb.reverse());
        // StringBuilder sbb = new StringBuilder(str);
        // System.out.println(sbb.reverse());

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);

        StringBuilder sbb= new StringBuilder(str);

        sbb.reverse();
        System.out.println(sbb);
    }
}
