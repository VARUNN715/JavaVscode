package Strings;

public class Add_Strings {
    public static void main(String[] args) {
        String sum = addString("100","200");
        System.out.println(sum);
    }

    public static String addString(String num1, String num2){
        int pointer1 = num1.length()-1;
        int pointer2 = num2.length()-1;
        int carry = 0; int base = 10;

        StringBuilder result = new StringBuilder();
        while (pointer1 >=0 || pointer2 >=0) {
            int s = 0,s1 = 0,s2 = 0;
            if (pointer1 >=0) {
                s1 = num1.charAt(pointer1) - '0';
                pointer1--;
            }

            if (pointer2 >=0) {
                s2 = num2.charAt(pointer2) - '0';
                pointer2--;
            }

            s = s1 + s2 + carry;

            if (s >= base) {
                carry = 1;
                s = s- base;
            }
            result.append(s);
        }
        if (carry == 1) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
    
}
