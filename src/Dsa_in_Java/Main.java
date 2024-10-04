package Dsa_in_Java;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int choice;
        Stacks myStack = new Stacks();

        do{
            choice = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice: \n 1: push\n 2 pop \n 3 display \n 4 exit\n"));
            
            

            switch (choice) {
                case 1:
                        int newItem = Integer.parseInt(JOptionPane.showInputDialog("Enter the element to be pushed: "));
                        
                        myStack.push(newItem);
                        break;
                case 2:
                        myStack.pop();
                        break;
                
                case 3:
                        myStack.display();
                        break;

                case 4:
                        JOptionPane.showMessageDialog(null, "...Exit...");
                        break;
                default:
                        JOptionPane.showMessageDialog(null, "....Invalid Input....");
                        break;
            }

        }while(choice != 4);

        sc.close();
    }


}