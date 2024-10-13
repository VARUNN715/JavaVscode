package Sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr = new int[]{12,5,2,1,15,10};
        selectionSort(arr);
    }   
    
    public static void selectionSort(int[] arr){ 
        //time complexity = O(n^2)
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[smallest] > arr[j]) {
                  //updating the smallest index
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
