package CollectionFrame.ListInterfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listinter {
    public static void main(String[] args) {
        // List<Integer> list = new LinkedList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);

        // System.out.println(list);
        // list.set(0,200);
        // System.out.println(list);
        // list.add(1,1000);
        // System.out.println(list);

        List <String> fruits = new LinkedList<>();
        
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("guava");
        fruits.add("jack fruit");
        // for(int i=0;i<fruits.size();i++){
        //     System.out.print(fruits.get(i)+" ");
        // }

        System.out.println(fruits.size());

        Iterator <String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(" "+iterator.next());
        }
    }
}
