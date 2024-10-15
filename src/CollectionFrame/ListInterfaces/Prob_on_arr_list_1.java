package CollectionFrame.ListInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob_on_arr_list_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Integer[] integerArr = new Integer[arr.length];

        for(int i=0;i<integerArr.length;i++){
            integerArr[i] = arr[i];
        }
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(integerArr));
        System.out.println(arrList);
       
    }
}
