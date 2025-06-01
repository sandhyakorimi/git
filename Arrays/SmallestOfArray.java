package Arrays;
import java.util.Scanner;

public class SmallestOfArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array : ");
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        long small = arr[0];
        System.out.print("Enter "+n+" numbers : ");
        for(int i=2; i<n; i++){
            if((arr[i]<arr[i-1]) && (arr[i]<arr[i-2])){
                small = arr[i];
            }
            else if((arr[i-1]<arr[i]) && (arr[i-1])<arr[i-2]){
                small = arr[i-1];
            }
            else{
                small = arr[i-2];
            }
        }
        System.out.println("Smaller number is : "+small);
        sc.close();
    }
}