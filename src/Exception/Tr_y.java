package Exception;

public class Tr_y {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        try{
            System.out.println(arr[8]);
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is an Arrary bounds exception here");
            System.exit(0); 
        }
        finally{
            System.out.println("this will run even if there is an exception"); // will not execute if System.exit() is used
        }
    }
}
