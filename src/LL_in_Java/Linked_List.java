package LL_in_Java;

public class Linked_List {
    Node head = null;
    Node tail = null;
    int length;

    Linked_List(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void addNode(int value){
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next =newNode;
            tail = newNode;
        }
        length++;
    }

    public void display(){
        Node temp = head;

        if (head == null) {
            System.out.println("No items to display");
        }
        
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
   

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;

        }
        newNode.next = head;
        head =  newNode;
        length++;
    }

    public void pop() {
        if (length == 0) {
            System.out.println("Empty");
            return; // Exit the method if the list is empty
        }
    
        if (length == 1) {
            // If there's only one node, set head and tail to null
            head = null;
            tail = null;
        } else {
            Node pre = null;
            Node temp = head;
    
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
    
            // Update tail and remove the last node
            tail = pre;
            tail.next = null;
        }
    
        length--;
    }
    
}
