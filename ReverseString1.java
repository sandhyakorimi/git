import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String in reverse: " + rev);
        sc.close();
    }
}
