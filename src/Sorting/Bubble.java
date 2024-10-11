package Sorting;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{12,1,5,10,2};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){

        //time complexity = O(n^2)
        for(int i=0;i<arr.length-1;i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }              
            }
        }
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i]+" ");
        }
    }    
}
