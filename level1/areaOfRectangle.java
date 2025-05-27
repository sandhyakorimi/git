package level1;

import java.util.Scanner;
public class areaOfRectangle{
    public static int area(int l, int b){
       
        return l*b;
    }
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter length:");
         int length = sc.nextInt();
         System.out.println("enter breadth:");
         int breadth = sc.nextInt();
        int area = area(length,breadth);
        System.out.println("area of rectangle is :"+area);
        sc.close();
    }
}

