package level2;
import java.util.Scanner;
public class LcmNGcd {
    public static int GCDofTwo(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp; 
        }
        return a;
    }
    public static int LCMofTwo(int a, int b){
        return (a*b)/GCDofTwo(a,b);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int num1 = sc. nextInt();
        int num2 = sc.nextInt();
        int LCM = LCMofTwo(num1, num2);
        int GCD = GCDofTwo(num1, num2);
        System.out.println("LCM is : "+LCM);
        System.out.println("GCD is : "+GCD);
         sc.close();
    }
}
