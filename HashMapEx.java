import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> roll_num = new HashMap<>();
        roll_num.put(null, "test");
        roll_num.put(2,"hello");
        roll_num.put(3, "how are you");

        roll_num.putIfAbsent(null, "TEST");
        roll_num.putIfAbsent(4, "hii");
        for(Map.Entry<Integer, String> entrymap : roll_num.entrySet()){
            Integer key = entrymap.getKey();
            String val= entrymap.getValue();
            System.out.println("Key : " +key+ " Value : "+val);
        }
        System.out.println("IsEmpty : "+roll_num.isEmpty());

        System.out.println("Size: "+roll_num.size());

        System.out.println("containsKey: "+roll_num.containsKey(3));

        System.out.println("get(1): "+roll_num.get(1));

        System.out.println("get(9): "+roll_num.getOrDefault(9, "default value"));

        System.out.println("removenull: "+roll_num.remove(null));

        System.out.println("get(0) : "+roll_num.get(0));

        
    }
}
