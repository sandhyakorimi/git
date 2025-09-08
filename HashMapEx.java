import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> roll_num = new HashMap<>();
        roll_num.put(null, "test");
        roll_num.put(2,"hello");
        for(Map.Entry<Integer, String> entrymap : roll_num.entrySet()){
            Integer key = entrymap.getKey();
            String val= entrymap.getValue();
            System.out.println("Key : " +key+ " Value : "+val);
        }
    }
}
