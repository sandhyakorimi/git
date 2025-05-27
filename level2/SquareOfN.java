package level2;
import java.util.Scanner;
public class SquareOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the square : ");
        int num = sc.nextInt();
        int Square = num*num;
        System.out.println("Square of "+num+" is : "+Square);
        sc.close();
    }
}
