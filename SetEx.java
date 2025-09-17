import java.util.*;
public class SetEx {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        System.out.println("First set : ");
        set1.add(2);
        set1.add(34);
        set1.add(3);
        set1.add(5);
        set1.forEach((Integer n)-> System.out.println(n));

        Set<Integer> set2 = new HashSet<>();
        System.out.println("Second Set : ");
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(5);
        set2.forEach((Integer n)->System.out.println(n));

        //Add all (UNION)
        System.out.println("Union method : ");
        set1.addAll(set2);
        set1.forEach((Integer n)->System.out.println(n));

        // Remove all
        System.out.println("Remove all : ");
        set1.removeAll(set2);
        set1.forEach((Integer n)->System.out.println(n));

        //Retain all (Intersection)
        System.out.println("Retain all : ");
        set1.retainAll(set2);
        set1.forEach((Integer n)-> System.out.println(n));
    }
}
