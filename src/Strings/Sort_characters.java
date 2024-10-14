package Strings;

public class Sort_characters {
    public static void main(String[] args) {
        String str = "rock";
        sortChar(str);
    }

    public static void sortChar(String str){
        char[] charArr = str.toCharArray();
        for(int i=0;i<charArr.length-1;i++){
            for(int j=i+1;j<charArr.length;j++){
                if (charArr[i] > charArr[j]) {
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }

        for(int i=0;i<charArr.length;i++){
            System.out.print(charArr[i]+" ");
        }
    }
}
