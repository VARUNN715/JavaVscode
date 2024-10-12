package HashMap;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        System.out.println(set.contains(1));
        //Delete 
        set.remove(1);
        System.out.println(set.contains(1));
    }
}
