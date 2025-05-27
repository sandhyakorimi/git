import java.util.Scanner;
public class AsciiChar {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int ascii = sc.nextInt();
        if(ascii>=0 && ascii<=127){
            char ch = (char)ascii;
            System.out.println("the char is:"+ch);
        }

        sc.close();
    }
}