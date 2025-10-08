package level2;

import java.util.Scanner;

public class Armstrong {public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc. nextInt();
        int temp = num;
        int arm = 0;
        int n = String.valueOf(num).length();
        if(num==0){
            System.out.println("Zero is not a armstrong number. ");
        }
        else{
            while(temp!=0){
                int digit = temp % 10;
                arm += Math.pow(digit,n);
                temp /= 10;
            }
            if(num==arm){
                System.out.println(num+" is a Armstrong Number.");
            }
            else System.out.println(num+" is not a Armstrong Number.");
            
        }

        sc.close();
    }
   
}
