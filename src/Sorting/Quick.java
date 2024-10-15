package Sorting;

public class Quick {
    public static void main(String[] args) {
        int[] arr = new int[]{10,1,5,9,2,7,6};
        quickSort(arr,0,arr.length-1);
 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
   
    public static void quickSort(int[] arr,int start,int end){
        if (start>= end) {
            return;
        }
        else{
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);

        }
    }

    public static int partition(int[] arr, int start,int end){
        int pivot =  arr[end];
        int i = start -1;

        for(int j=start;j<arr.length;j++){
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }

    
}
