package Arrays;

import java.util.Scanner;

public class LargestOfArray {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc. nextInt();
        long[] arr = new long[n];
        long large = arr[0];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        for(int i=2; i<n; i++){
            if((arr[i]>arr[i-1]) && (arr[i]>arr[i-2])){
                large = arr[i];
            }
            else if((arr[i-1]>arr[i]) && (arr[i-1]>arr[i-2])){
                large = arr[i-1];
            }
            else{
                large = arr[i-2];
            }
        }
        System.out.println("Large is : "+large);
        sc.close();
    }
}
