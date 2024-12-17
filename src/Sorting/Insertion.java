package Sorting;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = new int[]{12,2,1,15,24,3};
        insertionSort(arr);
        
    }
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            int j =i-1;

            while (j>=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--; // j=j-1
            }
            arr[j+1] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
