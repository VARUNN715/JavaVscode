package Strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Remove_dupl_char {
    public static void main(String[] args) {
        String str = "Hello World";
        
        Map<Character,Integer> charCount = new HashMap<>();

        char[] charArr = str.toCharArray();
        List<Character> str1 = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for(char c : charArr){
            if (charCount.containsKey(c)) {
                charCount.put(c,charCount.get(c)+1);
                //charCount.remove(c);
            }
            else{
                charCount.put(c,1);
                result.append(c);
                str1.add(c);
            }
        }
        System.out.println(str1);
    }
}
