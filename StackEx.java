import java.util.*;
public class StackEx {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(12);
        stack.push(32);
        stack.push(89);
        stack.forEach((Integer n)->System.out.println(n));
        System.out.println("Pop is : "+stack.pop());
        System.out.println("Peak is : "+stack.peek());
    }
}


