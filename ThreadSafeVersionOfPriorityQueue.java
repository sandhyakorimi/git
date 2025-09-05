import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class ThreadSafeVersionOfPriorityQueue {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
        pbq.add(10);
        pbq.add(23);
        pbq.forEach((Integer n )->System.out.println(n));
        System.out.println("Peek Element : " + pbq.peek());
    }
}
