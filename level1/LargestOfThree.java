package level1;
import java.util.Scanner;
public class LargestOfThree {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        if(a==b&&a==c){
            System.out.println("all three are same");
        }
        else if(a>=b&&a>=c){
            System.out.println("first number a is big : "+a);
        }
        else if(b>=a&&b>=c){
            System.out.println("second number b is big : "+b);
        }
        else{
            System.out.println("third number c is big : "+c);
        }
        sc.close();
   } 
}
