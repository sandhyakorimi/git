import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
public class ThreadSafeVersionofArrayDeque {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> CLD = new ConcurrentLinkedDeque<>();
        CLD.addFirst(30);
        CLD.addFirst(23);
        CLD.addFirst(12);
        CLD.forEach((Integer n)->System.out.println(n));
        int rem = CLD.removeFirst();
        System.out.println("Element Removed is : "+rem);
    }
}
