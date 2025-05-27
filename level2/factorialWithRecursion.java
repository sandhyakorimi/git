package level2;
import java.util.Scanner;
public class factorialWithRecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of num "+num+" is : 5" +fact);
        sc.close();
    }
    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
