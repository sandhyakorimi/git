package level1;
import java.util.Scanner;
public class fahrenToCelcius {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
   System.out.println("enter a fahren heat temperature:");
   double fahren = sc.nextDouble();
   double celcius = (fahren-32)*5/9;
   System.out.println("the celcius is :"+celcius);
   sc.close();
}
}
