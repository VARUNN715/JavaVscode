package Strings;
import java.util.StringTokenizer;
import java.util.Stack;


public class reverse_word {
    public static void main(String[] args) {
        String str = "This is a new Pc";

        Stack<Character> stack = new Stack<>();
        char[] charStr = str.toCharArray();

        for(int i=0;i<str.length();i++){
            if (str.charAt(i) != ' ') {
                stack.push(str.charAt(i));
            }
            else{
                while (stack.isEmpty() == false) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        }
        while (stack.isEmpty() == false) {
            System.out.print(stack.pop());
        }
    }
    
}
