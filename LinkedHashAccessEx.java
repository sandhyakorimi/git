import java.util.*;
public class LinkedHashAccessEx {
    public static void main(String args[]){
        Map<Integer, String> acc = new LinkedHashMap<>(16,.75F,true);
        acc.put(1,"A");
        acc.put(2, "B");
        acc.put(3,"c");
        acc.get(2);
        acc.forEach((Integer key, String val)->System.out.println(key +" : "+ val));
    }
}
