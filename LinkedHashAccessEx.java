import java.util.*;
public class LinkedHashAccessEx {
    public static void main(String args[]){
        Map<Integer, String> acc = new LinkedHashMap<>(16,.75F,true);
        acc.put(1,"A");
        acc.put(2, "B");
        acc.put(3,"D");
        acc.put(4,"E");
        acc.put(5,"F");
        acc.get(2);
        acc.get(2);
        acc.get(1);
        acc.forEach((Integer key, String val)->System.out.println(key +" : "+ val));

        // thread safe version explicitly

        System.out.println("Explicitly thread safe version of linked hashmap : ");
        Map<Integer,String> map2 = Collections.synchronizedMap(new LinkedHashMap<>()) ;
        map2.put(9,"K");
        map2.put(10,"Sandy");
        map2.forEach((Integer key2, String val2)->System.out.println(key2 +" : "+val2));
      }
}
