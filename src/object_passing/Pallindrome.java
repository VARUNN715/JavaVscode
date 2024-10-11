package object_passing;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome(1001));
    }

    public static boolean isPallindrome(int n){
        int num = n;
        if (num<0) {
            return false;
        }
        else{
            int revNum = 0;
            while (num>0) {
                int lastDigit = num % 10;
                 revNum = revNum * 10 + lastDigit;
                num = num / 10;
            }
            if (revNum == n ) {
                
                return true;
            }
            else{
                return false;
            }
        }
    }
}
