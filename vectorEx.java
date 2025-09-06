import java.util.*;
public class vectorEx{
    public static void main(String args[]){
        Vector<Integer> vec = new Vector<>();
        vec.add(30);
        vec.add(23);
        vec.forEach((Integer n)->System.out.println("vector element at index " +vec.indexOf(n)+" is "+ n));
    }
}