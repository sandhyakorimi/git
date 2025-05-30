// 
package level2;
import java.util.Scanner;
public class ReverseDigitsOfANum {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int reverse = 0;
        int temp = num;
        if(num==0){
            reverse = 0;
        }
        else{
            while(temp!=0){
                int digit = temp % 10;
                reverse = reverse*10+digit;
                temp = temp/10;
            }
        }
        System.out.println("reverse of "+num+" is : "+reverse);
       sc.close();
    }
}
