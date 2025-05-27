package level2;

import java.util.Scanner;

public class fibonacciFromAnyTwoNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc. nextInt();
        System.out.print("Enter another number : ");
        int m = sc. nextInt();
        int fib =0;
        System.out.print("Enter the nth term to find : ");
        int fibNum = sc.nextInt();
        for(int i=3; i<=fibNum ;i++){
            fib=n+m;
            n=m;
            m=fib;
        }
        System.out.println("The "+fibNum+"th term is : "+fib);
        sc.close();
    }
}
