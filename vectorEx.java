import java.util.*;
public class vectorEx{
    public static void main(String args[]){
        Vector<Integer> vec = new Vector<>();
        vec.add(30);
        vec.add(23);
        vec.add(34);
        vec.forEach((Integer n)->System.out.println("vector element at index " +vec.indexOf(n)+" is "+ n));
        vec.remove(1);
        System.out.println("Element at index 1 is : "+vec.get(1));
    }
}