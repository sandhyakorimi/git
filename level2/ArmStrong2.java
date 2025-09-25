package level2;
import java.util.Scanner;
public class ArmStrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int digits = String.valueOf(num).length();
        int arm = 0;
        while(temp!=0){
            int digit = num%10;
            arm += Math.pow(digit, digits);
            temp/=10;
        }
        if(num==arm){
            System.out.println(" ArmStrong Number");
        }
        else System.out.println("Not ArmStrong Number");
    }
}
