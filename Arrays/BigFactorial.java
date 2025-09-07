package Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc. nextInt();
        BigInteger fact = BigInteger.ONE;
        for(int i=2; i<=n; i++){
          fact = fact.multiply(BigInteger.valueOf(n));
        }
        System.out.println("The factorial of "+n+" is  : "+fact);
        sc.close();
    }  
}
