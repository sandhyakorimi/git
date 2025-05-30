package level2;

import java.util.Scanner;

public class NumberOfDigits {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc. nextInt();
        
        // int count = 0;
        // int temp = num;
        // if(num==0){
        //     count=1;
        // }
        // else{
        //     while(temp!=0){
        //         temp/=10;
        //         count++;
        //     }
        // }

        int n = String.valueOf(num).length();

        System.out.println(n);
        sc.close();
    }
   
}
