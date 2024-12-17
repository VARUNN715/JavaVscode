package object_passing;

public class PowOfTwo {
    public static void main(String[] args) {
        System.out.println(PowOfTwo(512));
    }   
    
    public static boolean PowOfTwo(int n){
        int x = n;
        if (n<=0) {
            return false;
        }
        else{
            while (n %2 == 0) {
                n = n / 2;
            }
            if (n == 1) {
                return true;
            }
            else{
                return false;
            }
        }
    }
}
