package CollectionFrame;

import java.util.ArrayList;

public class ArraList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(101);
        arr.add(102);
        arr.add(103);
        //this is an example for array
        arr.trimToSize();
        System.out.println(arr.size());
    }
    
}

