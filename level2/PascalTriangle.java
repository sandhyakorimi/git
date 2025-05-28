package level2;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int rows = sc. nextInt();

        // triangle like        1
        //                    1    1
        //                  1   2     1
        //                1   3    3     1

        for(int i=0; i<rows ; i++){
            for(int spaces=0;spaces<rows-i;spaces++){
                System.out.print(" ");
            }
            int number = 1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number = number*(i-j)/(j+1);
            }
            System.out.println();
        }

        sc.close();
    }
}
