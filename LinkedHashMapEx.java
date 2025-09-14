import java.util.*;
public class LinkedHashMapEx {
    public static void main(String args[]){
            System.out.println("Linked Hash Map Ex............");

            Map<Integer, String> LiHaMap = new LinkedHashMap<>();
            LiHaMap.put(1, "A");
            LiHaMap.put(21, "B");
            LiHaMap.put(23, "C");
            LiHaMap.forEach((Integer key, String val)->System.out.println(key + " : "+ val));

            System.out.println("Normal Hash Map Ex............");
            Map<Integer, String> HMap = new HashMap<>();
            HMap.put(1, "Hloo!");
            HMap.put(23, "How");
            HMap.put(21, "are you?");
            for(Map.Entry<Integer, String> entry: HMap.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
    }
}
