package Dsa_in_Java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        Stacks myStack = new Stacks();

        do{
            System.out.println("Enter your choice: ");
            System.out.println("1 Push");
            System.out.println("2 Pop");
            System.out.println("3 Display");
            System.out.println("4 Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                        int newItem;
                        System.out.println("Enter the element to push: ");
                        newItem = sc.nextInt();
                        myStack.push(newItem);
                        break;
                case 2:
                        myStack.pop();
                        break;
                
                case 3:
                        myStack.display();
                        break;

                case 4:
                        System.out.println(".....Exiting.....");
                        break;
                default:
                        System.out.println("......Invalid input......");
                        break;
            }

        }while(choice != 4);

        sc.close();
    }
}