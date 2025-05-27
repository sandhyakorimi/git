package level1;
import java.util.Scanner;
public class CelciusToFahren {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a celcius value : ");
        double celcius = sc.nextDouble();
        double fahren = (celcius*9/5)+32;
        System.out.println("fahren heat value is:"+fahren);
        sc.close();
    }
}
