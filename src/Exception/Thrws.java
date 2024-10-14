package Exception;

public class Thrws {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{1,2,3,4,5};
        getNumber(arr);
    }
    public static void getNumber(int[] arr) throws Exception{
        System.out.println(arr[8]);
    }
}
