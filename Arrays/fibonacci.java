package Arrays;

import java.util.Scanner;

public class fibonacci {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a how many numbers you want to print : ");
        int n = sc. nextInt();
        if(n<=0){
            System.out.println("enter a  positive number");
        }
        long[] fib = new long[n];
        fib[0]=0;
        if(n>1){
            fib[1]=1;
            for(int i=2; i<n; i++){
                fib[i] = fib[i-1]+fib[i-2];
            }
            for(int i=0; i<n; i++){
                System.out.print(fib[i]+" ");
            }
        }
        
      sc.close();
    }
}
