package Queue2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorqueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//max heap
        // Queue<Integer> pq = new PriorityQueue<>(); //min heap
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
