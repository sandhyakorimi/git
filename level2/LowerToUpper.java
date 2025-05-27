package level2;

import java.util.Scanner;

public class LowerToUpper {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str1 = sc.nextLine();
        String str2 = str1.toUpperCase();
        System.out.print("The UpperCase of  "+str1+" is : "+str2);
        sc.close();
    }
}
