package Patterns;

import java.util.Scanner;

public class diamond {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc. nextInt();
        for(int i=1; i<=n; i++){
            for(int spaces=1; spaces<=n-i; spaces++){
                System.out.print(" "); 
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int spaces=1; spaces<=i; spaces++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
   
}
