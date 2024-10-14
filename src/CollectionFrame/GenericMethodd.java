package CollectionFrame;

public class GenericMethodd {
    public static void main(String[] args) {
        printData("Hello World!!");
        printData(21);
        printData(21.2222222);
        printData(3.14f);
    }

    static<E> void printData(E data){
        System.out.println(data);
    }
}
