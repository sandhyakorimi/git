import java.util.*;
public class Lists {
    public static void main(String args[]){
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(24);
        list1.add(12);
        list1.forEach((Integer n)-> System.out.println("Element : " +n ));
    }
}
