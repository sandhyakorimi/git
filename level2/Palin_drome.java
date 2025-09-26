// package level2;
import java.util.Scanner;
public class Palin_drome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or String : ");
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1 ; i>=0; i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println(str + " : is Palindrome. ");
        }
        else System.out.println(str+ " : is not a palindrome. ");
    }
}
