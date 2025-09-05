import java.util.*;
public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> ArrayDequeasQueue = new ArrayDeque<>();
        ArrayDequeasQueue.addLast(10);
        ArrayDequeasQueue.addLast(30);
        ArrayDequeasQueue.addLast(12);
        ArrayDequeasQueue.forEach((Integer n)->System.out.println(n));
        int del = ArrayDequeasQueue.removeFirst();
        System.out.println("Element Deleted : " +del);

        ArrayDeque<Integer> ArrayDequeasStack = new ArrayDeque<>();
        ArrayDequeasStack.addFirst(45);
        ArrayDequeasStack.addFirst(23);
        ArrayDequeasStack.addFirst(90);
        ArrayDequeasStack.forEach((Integer n)->System.out.println(n));
        int rem = ArrayDequeasStack.removeFirst();
        System.out.println("Element Deleted : " +rem);
    }
}
