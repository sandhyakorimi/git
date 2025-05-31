package level2;

import java.util.Scanner;

public class Palindrome {  
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc. nextInt();
        int temp = num;
        int palin = 0;
        if(num == 0){
            System.out.println("Zero is Not a Palindrome");
        }
        else{
            while(temp!=0){
                int digit = temp%10;
                palin = palin*10 + digit;
                temp /= 10;
            }
            if(num==palin){
                System.out.println("The "+num+" is a Palindrome number");
            }
            else System.out.println("The "+num+" is not a Palindrome number");
           
        }
        sc.close();
    }
   
}
