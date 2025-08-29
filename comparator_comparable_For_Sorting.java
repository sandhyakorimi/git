import java.util.*;
public class comparator_comparable_For_Sorting {
    public static void main(String[] args) {
        Integer a[] = {6,3,7,1,4};
        Arrays.sort(a,(Integer val1, Integer val2)->val2-val1);
        for(int v : a){
            System.out.println(v);
        }
    }
}
