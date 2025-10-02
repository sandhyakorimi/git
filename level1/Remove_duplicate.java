import java.util.Scanner;
import java.util.ArrayList;
public class Remove_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of elements to add into an array : ");
        int n = sc.nextInt();
        System.out.println(" Enter "+n+ " elements : ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> uniquelist = new ArrayList<>();
        for(int val: arr){
            if(!uniquelist.contains(val)){
                uniquelist.add(val);
            }
        }
        System.out.println("Array after removing duplicates : "+uniquelist);
        sc.close();
    }
}
