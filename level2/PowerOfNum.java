package level2;

import java.util.Scanner;

public class PowerOfNum {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc. nextInt();
        System.out.print("Enter another number : ");
        int y = sc.nextInt();
        int powVal = x;
        for(int i=1 ; i<y; i++){
            powVal *= x; 
        }
        System.out.println("The "+x+" to the power of "+y+" is : "+powVal);
         sc.close();
    }
}
