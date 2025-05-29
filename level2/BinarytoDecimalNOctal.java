package level2;

import java.util.Scanner;

public class BinarytoDecimalNOctal {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary,2);

        String octal = Integer.toOctalString(decimal);

        System.out.println("deimal: "+decimal);
        System.out.println("octal: "+octal);
        sc.close();
    }
   
}
