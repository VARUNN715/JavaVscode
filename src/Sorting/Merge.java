package Sorting;

public class Merge {
    public static void divide(int[] arr, int si, int ei){
        if (si>=ei) {
            return;
        }
        else{
            int mid = si + (ei-si) / 2;
            divide(arr, si, mid);
            divide(arr, mid+1, ei);
            mergeArr(arr, si, mid, ei);
        }

    }

    public static void mergeArr(int[] arr, int si, int mid,int ei){
        int[] merge = new int[ei-si+1];

        int indx1 = si;
        int indx2 = mid+1;
        int i = 0;

        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merge[i] = arr[indx1];
                i++;
                indx1++; 
            }
            else{
                merge[i] = arr[indx2];
                i++;
                indx2++;
            }
        }

        while (indx1<= mid) {
            merge[i] = arr[indx1];
            i++;
            indx1++;
        }

        while (indx2 <= ei) {
            merge[i] = arr[indx2];
            i++;
            indx2++;
        }

        for(int itr=0,j=si;itr<merge.length;itr++,j++){
            arr[j] = merge[itr];
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,6,8,3,4,5,1,1,10,2,7};
        divide(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
