import java.util.*;
public class SortedMapEx {
    public static void main(String[] args) {
        SortedMap<Integer, String> map1 = new TreeMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(9,"I");
        map1.put(10," J");
        map1.put(12,"L");
        System.out.println("Head Map : "+map1.headMap(10));
        System.out.println("Tail Map : "+map1.tailMap(10));
        System.out.println("First Key : "+map1.firstKey());
        System.out.println("Last Key : "+map1.lastKey());
    }
}
