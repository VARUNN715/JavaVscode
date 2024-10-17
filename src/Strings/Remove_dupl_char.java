package Strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Remove_dupl_char {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuffer sb = new StringBuffer();
        
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] charArr = str.toCharArray();

        for (char c : charArr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
