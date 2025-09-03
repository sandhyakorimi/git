import java.util.PriorityQueue;
public class MinPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(60);
        pq.add(45);
        pq.add(12);
        System.out.println("MinPriorityQueue: "+pq);
        pq.forEach((Integer val)->System.out.println(val));
        while (!pq.isEmpty()){
            int val = pq.poll();
            System.out.println("remove from top : "+val);
        } 
    }
}
