package Patterns;

import java.util.Scanner;

public class InversePyramid {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc. nextInt();
        for(int i=1; i<=n; i++){
            for(int spaces=1; spaces<i;spaces++){
                System.out.print(' ');
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("1 ");
            }
            System.out.println();
        }
        sc.close();
    }
   
}
