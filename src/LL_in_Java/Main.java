package LL_in_Java;

public class Main {
    public static void main(String[] args) {
        Linked_List myLinked_List = new Linked_List(10);
        myLinked_List.addNode(10);
        myLinked_List.addNode(20);
        myLinked_List.addNode(30);

        myLinked_List.append(40);
        myLinked_List.prepend(111);
        myLinked_List.pop();
        myLinked_List.display();
    }
    
}
