package CollectionFrame;

public class GenericMethodd {
    public static void main(String[] args) {
        printData("Hello World!!");
        printData(21);
    }

    static<E> void printData(E data){
        System.out.println(data);
    }
}
