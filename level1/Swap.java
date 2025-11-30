package level1;
import java.util.Scanner;
public class Swap{
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b = sc.nextInt();

        a=a+b;                         
        b=a-b;  
        a=a-b;
        System.out.println("Now after Swapping first number is: "+a+" & the 7Second number is: "+b);
        sc.close();                
    }   
}                           