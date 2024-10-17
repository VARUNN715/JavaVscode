package CollectionFrame.Set_Interface;

import HashMap.Hashset;
import java.util.Iterator;
import java.util.HashSet;
public class Setss {
    public static void main(String[] args) {
        HashSet<Integer> sets = new HashSet<>(); // declaring a hash set
        sets.add(10);
        sets.add(20);
        sets.add(30);
        sets.add(40);
        sets.add(10);
        sets.remove(10);
        System.out.println(sets);
        if (sets.contains(10)) {
            System.out.println("this is present");
        }else{
            System.out.println("not there bro");
        }
        System.out.println(sets.size());
        Iterator it = sets.iterator(); //iterator
        //hasNext() and next()
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
