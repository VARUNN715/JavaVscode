package Strings;

import java.util.*;

public class first_non_repChar {
    public static void main(String[] args) {
        String str = "kaaabcdefbcdefhij"; // should return h

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        System.out.println(map);

        for(Map.Entry<Character, Integer> entrySet : map.entrySet()){
            if (entrySet.getValue() == 1) {
                System.out.println( entrySet.getKey()); //this should stop at h and return h;
                break;
            }
        }
        for(int i=0;i<str.length();i++){
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
       // approach 1

       for(int i=0;i<str.length();i++){
        boolean unique = true;
        for(int j=i+1;j<str.length();j++){
            if (str.charAt(i) == str.charAt(j)) {
                unique = false;
            }
        }
        if(unique){
            System.out.println(str.charAt(i));
            break; //this should return k
        }
       }
    }
}
