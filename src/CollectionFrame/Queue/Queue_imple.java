package CollectionFrame.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_imple {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.offer(40);

        System.out.println(queue);
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);

        
    }
}