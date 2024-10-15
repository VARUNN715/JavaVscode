package CollectionFrame.ListInterfaces;

import java.util.ArrayList;
import java.util.List;

    public class ArryList {
    public static void main(String[] args) {
        // array list are dyanamic in size
        List<Integer> arrList = new ArrayList<>();
        List<Integer> arrList2 = new ArrayList<>();

        // to add items to the array list 
        
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        
        arrList2.add(1);
        arrList2.add(2);
        arrList2.add(3);

        arrList.addAll(arrList2);
        // System.out.println(arrList);
        // arrList.remove(0);

        // for (Integer item : arrList) {
        //     System.out.println(item);
        // }
        
        System.out.println(arrList.contains(10));
        // arrList.remove(0);
        // arrList.remove(Integer.valueOf(20));
        System.out.println(arrList.contains(10));
        for(int i=0;i<arrList.size();i++){
            System.out.println(arrList.get(i));
        }
    }    
}
