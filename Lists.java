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

        list1.replaceAll((Integer n)->-1*n);
        System.out.println("List after replace all : ");
        list1.forEach((Integer n)-> System.out.println(n));

        list1.sort((Integer a, Integer b)->b-a);                                //sort
        System.out.println("After sorting : ");
        list1.forEach((Integer n)-> System.out.println(n));

        System.out.println("Value present at index 2 : "+list1.get(2));  //get

        list1.set(2,400);
        System.out.println("After setting value at index 2");
        list1.forEach((Integer n)->System.out.println(n));                    //set

        System.out.println("element at index 4 is : "+list1.get(4));
        list1.remove(4);                                                //remove
        System.out.println("After removing element at index 4: ");
        list1.forEach((Integer n)->System.out.println(n));

        System.out.println("Index of -10 is : "+list1.indexOf(-10));        //indexOf

        ListIterator<Integer> listIterator2 =  list1.listIterator() ;
        while(listIterator2.hasNext()){
            int val = listIterator2.next();
            System.out.println("Element is : "+val+" Previous Index is : "+listIterator2.previousIndex()+" Next Index is : " +listIterator2.nextIndex());
            if(val==-12){
                listIterator2.add(-100);
            }
        }
        list1.forEach((Integer n)->System.out.println(n));
    }
}
