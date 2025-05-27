package level1;
import java.util.Scanner;
public class AsciiValue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Character");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("The ascii value of "+ch+" is: "+ascii);
        sc.close();
    }
}
