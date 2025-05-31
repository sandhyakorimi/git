package Patterns;

import java.util.Scanner;

public class TwoTriangles {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc. nextInt();
       
            for(int i=1; i<=n; i++){
                for(int spaces=1; spaces<=2*(n-i); spaces++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("1 ");
                }
                System.out.println();
            }
            for(int l=1; l<=n;l++){
                for(int spaces=1; spaces<=2*l; spaces++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n-l; j++){
                    System.out.print("1 ");
                }
                System.out.println();
            }
        

        sc.close();
    }
   
}
