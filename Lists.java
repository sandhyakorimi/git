import java.util.*;
public class Lists {
    public static void main(String args[]){
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(24);
        list1.add(12);
        list1.forEach((Integer n)-> System.out.println("Element : " +n ));
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(30);
        list2.add(10);
        list2.forEach((Integer n)-> System.out.println("Element : " +n));

        list1.addAll(1,list2);
            System.out.println("list 1 after adding list2");
        list1.forEach((Integer n)->System.out.println("Element : " +n));
    }
}
