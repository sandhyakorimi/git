import java.util.*;
public class TreeMapEx {
    public static void main(String args[]){
        //Using comporator
        System.out.println("Using comporator : ");
        Map<Integer, String> map1 = new TreeMap<>((Integer val1, Integer val2)->val2-val1);
        map1.put(4,"D");
        map1.put(1,"A");
        map1.put(9,"I");
        map1.put(2,"B");
        map1.forEach((Integer n , String str) ->System.out.println(n+" : "+str));

        System.out.println("Using Natural Order : ");
    }
}
