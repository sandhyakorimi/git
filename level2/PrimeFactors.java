package level2;

import java.util.Scanner;

public class PrimeFactors {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc. nextInt();
        for(int i=2; i<=Math.sqrt(num); i++){
          if(num%i==0){
            System.out.print(i+" ");
          }
        }     
        sc.close();
    }   
}
