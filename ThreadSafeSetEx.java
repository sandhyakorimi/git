import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class ThreadSafeSetEx {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();
        Set<Integer> threadSafeSet = concurrentHashMap.newKeySet();
        threadSafeSet.add(3);
        threadSafeSet.add(8);
        threadSafeSet.add(10);
        Iterator<Integer> iterator = threadSafeSet.iterator();
        while (iterator.hasNext()) {
            int val = iterator.next();
            if(val==8){
                threadSafeSet.add(9);         // due to thread safe it adds and runs another thread
            }
        }
        threadSafeSet.forEach((Integer n)->System.out.println(n ));
    }
}
