package Dsa_in_Java;


public class Stacks {
    static final int MAX = 5;
    int top;
    int[] stack = new int[MAX]; // creating a stack array

    Stacks(){
        top = -1;
    }

    public void push(int newItem){
        if (top>= MAX) {
            System.out.println("stack Overflow condition");
        }
        else{
            stack[++top] = newItem;
            System.out.println("Element pushed is: "+newItem);
        }
    }

    public void pop(){
        if (top<0) {
            System.out.println("stack underflow");
        }
        else{
            int popped_item = stack[top];
            top--;
            System.out.println("Element popped is: "+popped_item);
        }
    }

    public void display(){
        System.out.println("The Elements in Stack are");
        for (int i = top; i>=0; i--) {
            System.out.println(stack[i]);
        }
    }
}