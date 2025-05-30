package level2;

import java.util.Scanner;

public class SummationOfDigits {
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc. nextInt();
        int temp = num;
        int sum=0;
        if(num==0){
            System.out.println("Sum is : "+sum);
        }
        else{
            while(temp!=0){
                int digit = temp%10;
                sum += digit;
                temp /= 10;
            }
            System.out.println("Sum of digits in "+num+" is : "+sum);
        }

        sc.close();
    }
   
}
