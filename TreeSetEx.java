import java.util.*;
public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(3);
        set1.add(1);
        set1.add(9);
        set1.add(112);
        set1.add(86);
        Iterator<Integer> iterable = set1.iterator();
        while (iterable.hasNext()) {
            int val = iterable.next();
            System.out.println(val);
        }
    }
}
