package Sorting;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {2,6,8,3,4,5,1,1,10,2,7};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;

        if(inputLength < 2){
            return;
        }
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHAlf = new int[inputLength - midIndex];

        // for first half of array

        for(int i=0;i<midIndex;i++){
            leftHalf[i] = inputArray[i];
        }

        //for second half
        for(int i=midIndex;i<inputLength;i++){
            rightHAlf[i-midIndex] = inputArray[i];
        }
        
        mergeSort(leftHalf);
        mergeSort(rightHAlf);

        //merge
        merge(inputArray, leftHalf, rightHAlf);
    }


    public static void merge(int[] inputArray,int[] leftHalf,int[] rightHAlf){
        int leftSize = leftHalf.length;
        int rightSize = rightHAlf.length;
        int i=0;
        int j=0;
        int k=0;

        while (i<leftSize && j<rightSize) {
            if (leftHalf[i] <= rightHAlf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else{
                inputArray[k] = rightHAlf[j];
                j++;
            }
            k++;
        }

        while (i<leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j<rightSize) {
            inputArray[k] = rightHAlf[j];
            j++;
            k++;
        }
    }

}

