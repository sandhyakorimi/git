import java.util.*;
public class LinkedHashSetEx {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(4 );
        set1.add(5);
        set1.add(6);
        set1.add(90);
        set1.add(9);
        set1.add(89);
        Iterator<Integer> iterable = set1.iterator();
        while (iterable.hasNext()) {
            int val = iterable.next();
            System.out.println(val );
        }
    }
}
