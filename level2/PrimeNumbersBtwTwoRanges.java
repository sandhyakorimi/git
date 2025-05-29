package level2;

import java.util.Scanner;

public class PrimeNumbersBtwTwoRanges {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int start = sc. nextInt();
        int end = sc.nextInt();
        System.out.println("The prime numbers between "+start+" and "+end+" are :");
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
         sc.close();
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
