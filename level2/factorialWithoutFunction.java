package level2;
import java.util.Scanner;
public class factorialWithoutFunction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate the factorial : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("fact of num "+num+" is :"+fact);
        sc.close();
    }
}
