package Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class ReverseArray {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements in an array : ");
        int n = sc. nextInt();
        System.out.print("Enter the "+n+" elements : ");
        BigInteger arr[] = new BigInteger[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextBigInteger();
        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            BigInteger temp = arr[start]; 
            arr[start]=arr[end];
            arr[end]=temp;

            start++ ;
            end-- ;
        }
        System.out.print("Reverse array is : ");
        for(BigInteger num:arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
