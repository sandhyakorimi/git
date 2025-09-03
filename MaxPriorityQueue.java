import java.util.PriorityQueue;
public class MaxPriorityQueue {
    public static void main(String args[]){
        PriorityQueue<Integer> MaxPQ = new PriorityQueue<>((Integer a , Integer b)->b-a);
        MaxPQ.add(20);
        MaxPQ.add(30);
        MaxPQ.add(34);
        MaxPQ.add(21);
        MaxPQ.add(2);
        MaxPQ.add(9);
        MaxPQ.forEach((Integer val)->System.out.println(val));
        while(!MaxPQ.isEmpty()){
            int val = MaxPQ.poll();
            System.out.println("The element removed is : "+ val);
        }
    }
}
