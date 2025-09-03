import java.util.PriorityQueue;
public class MinPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(60);
        pq.add(45);
        pq.add(12);
        System.out.println("MinPriorityQueue: "+pq);
    }
}
