import java.util.*;
public class LinkedListEx {
    public static void main(String args[]){
    LinkedList<Integer> list = new LinkedList<>();

    list.addLast(10);
    list.addLast(12);
    list.addLast(4);
    list.addLast(34);
    System.out.println("First is : " +list.getFirst());

    LinkedList<Integer> list2 = new LinkedList<>();
    list2.add(20);
    list2.add(23);
    list2.add(40);
    list2.add(90);
    list2.forEach((Integer n)->System.out.println(n));
    }
}
