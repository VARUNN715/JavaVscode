package CollectionFrame;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        // String str = "example string";
        // Map<Character, Integer> charCountMap = new HashMap<>();

        // for (char c : str.toCharArray()) {
        //     if (charCountMap.containsKey(c)) {
        //         charCountMap.put(c, charCountMap.get(c) + 1);
        //     } else {
        //         charCountMap.put(c, 1);
        //     }
        // }
        // // Print the character count map
        // for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }

        String str = "varunnn";
        Map<Character,Integer> charCount = new HashMap<>();
        char[] charArr = str.toCharArray();

        for(char c : charArr){
            if (charCount.containsKey(c)) {
                charCount.put(c,charCount.get(c)+1);
            }
            else{
                charCount.put(c,1);
            }
        }
        System.out.println(charCount);
    }
}
