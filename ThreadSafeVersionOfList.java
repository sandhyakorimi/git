import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class ThreadSafeVersionOfList {
    public static void main(String[] args) {
        List<Integer> list1 = new CopyOnWriteArrayList<>();
        list1.add(0,2);
        System.out.println(list1.get(0));
    }
}
